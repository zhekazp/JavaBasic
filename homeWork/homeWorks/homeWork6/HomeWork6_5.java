package homeWorks.homeWork6;

import classes.UserInput;
import homeWorks.homeWork6.classes.Numbers;

public class HomeWork6_5 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();

        double n1= ui.inputDouble("Enter first number");
        double n2= ui.inputDouble("Enter second number");

        Numbers n=new Numbers();

        System.out.println("The result of addition is "+n.addition(n1,n2));
        System.out.println("The result of subtraction is "+n.subtraction(n1,n2));
        System.out.println("The result of division is "+n.division(n1,n2));
        System.out.println("The result of multiplication is "+n.multiplication(n1,n2));
    }
}
