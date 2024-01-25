package homeWork3;

import classes.UserInput;

public class HomeWork3_8 {
    public static void main(String[] args) {
        UserInput ui= new UserInput();
        int n1=ui.inputInt("Enter first number.");
        int n2=ui.inputInt("Enter second number.");
        int n3=ui.inputInt("Enter third number.");
        if(n1 == n2 & n2== n3) {
            System.out.println("All numbers are equal");
        } else if(n1 != n2 & n2 != n3 & n1 != n3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
