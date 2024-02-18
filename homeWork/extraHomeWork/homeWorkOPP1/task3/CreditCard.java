package homeWorkOPP1.task3;

public class CreditCard {
    private String cartNumber;
    private int pin;
    private int balance=0;
    private int creditLimit=0;
    private int loanDebt=0;

    public CreditCard(String cartNumber, int pin) {
        this.cartNumber = cartNumber;
        this.pin = pin;
    }

    public void changeLimit(int newLimit){
        creditLimit=newLimit;
    }
    public void deposit(int pin, int sum){
        if(checkPin(pin)){
            setMoney(sum);
        }
    }
    private void setMoney(int sum){
        int temp=loanDebt-sum;
        if(temp>=0){
            loanDebt-=sum;
        }else{
            loanDebt=0;
            balance=temp*-1;
        }
        System.out.println("Sum added to your account");
        System.out.println();
    }
    public void withdraw(int pin, int sum){
        if(checkPin(pin)){
            if(checkLimits(sum)){
                getMoney(sum);
            }
        }
    }
    private void getMoney(int sum){
        int temp=balance-sum;
        if(temp>=0){
            balance-=sum;
        }else{
            balance=0;
            loanDebt+=temp*-1;
        }
        System.out.println("Get you money");
        System.out.println();
    }
    private boolean checkLimits(int sum){
        if(sum > (balance+creditLimit-loanDebt)){
            System.out.println("You don`t have enough money");
            System.out.println();
            return false;
        }
        return true;
    }
    private boolean checkPin(int pin){
        if(pin != this.pin){
            System.out.println("Incorrect pin");
            System.out.println();
            return false;
        }
        return true;
    }
    public void printBalance(){
        System.out.println("You balance - "+balance);
        System.out.println("Loan debt - "+loanDebt);
        System.out.println("===========================");
    }
}
