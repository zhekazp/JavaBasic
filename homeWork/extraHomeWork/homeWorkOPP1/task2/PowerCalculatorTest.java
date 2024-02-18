package homeWorkOPP1.task2;
/*Develop a PowerCalculator class that implements a single method
to raise a given number to a specified power.
Method name, parameter list and return type
come up with your own according to the conditions of the problem.
Implement a mathematical operation using a loop.
Write test scripts for the PowerCalculator class in the PowerCalculatorTest class.
All test scripts must run without errors.*/
public class PowerCalculatorTest {
    public static void main(String[] args) {
        PowerCalculator calc=new PowerCalculator();
        boolean test=true;
        if(calc.exponentiation(2,2)!=4){
            test=false;
        }
        if(calc.exponentiation(0,2)!=0){
            test=false;
        }
        if(calc.exponentiation(2,1)!=2){
            test=false;
        }
        if(calc.exponentiation(3,4)!=81){
            test=false;
        }
        if(test){
            System.out.println("application works correct");
        }else{
            System.out.println("application works incorrect");
        }

    }
}
