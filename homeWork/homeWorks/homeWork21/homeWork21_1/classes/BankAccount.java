package homeWorks.homeWork21.homeWork21_1.classes;

public class BankAccount {
    private double balance=0;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double depositSum){
        balance+=depositSum;
    }
    public void withdraw(double withdrawSum){
        balance-=withdrawSum;
    }
    public void printBalance(){
        System.out.println("You balance is : "+balance);
    }

}
