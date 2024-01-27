package homeWork3;

import classes.UserInput;
import homeWork3.classes.Calculator;
import homeWork6.classes.Numbers;

public class CalculatorDemo {
    public static void main(String[] args) {
        UserInput ui=new UserInput();

        double n1= ui.inputDouble("Enter first number");
        double n2= ui.inputDouble("Enter second number");

        Calculator n=new Calculator();

        System.out.println("The result of addition is "+n.addition(n1,n2));
        System.out.println("The result of subtraction is "+n.subtraction(n1,n2));
        System.out.println("The result of division is "+n.division(n1,n2));
        System.out.println("The result of multiplication is "+n.multiplication(n1,n2));
        if (n.isEven(n1)){
        System.out.println("The number 1 ("+n1+") is integer");}else{
            System.out.println("The number 1 ("+n1+") is float");
        }
        System.out.println(n.maxOfTwoNumbers(n1,n2));
    }
}
