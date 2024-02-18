package homeWorkOPP1.task2;

public class PowerCalculator {
    public int exponentiation(int number,int exp){
        int result=1;
        for(int i=1;i<=exp;i++){
            result*=number;
        }
        return result;
    }
}
