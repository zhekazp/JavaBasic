package homeWorks.homeWork38.homeWork5;


public class HomeWork5 {
    public static void main(String[] args) {
            NumberOperations primeNumber= number->{
                if(number<2){
                    return false;
                }
                for(int i=2;i<=number/2;i++){
                    if(i!=number && number%i==0){
                        return false;
                    }
                }
                return true;
            };
        System.out.println(primeNumber.calculate(7));
    }
    interface NumberOperations{
        boolean calculate(Integer number);
    }
}
