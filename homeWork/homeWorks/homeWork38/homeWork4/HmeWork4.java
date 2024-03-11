package homeWorks.homeWork38.homeWork4;

public class HmeWork4 {
    public static void main(String[] args) {
        NumberOperations factorial=number->{
            int result=1;
            for(int i=1;i<=number;i++){
                result*=i;
            }
            return result;
        };
        System.out.println(factorial.calculate(5));
    }
    interface NumberOperations{
        Integer calculate(Integer number);
    }
}
