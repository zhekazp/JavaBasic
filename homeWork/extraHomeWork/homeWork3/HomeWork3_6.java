package homeWork3;

import classes.UserInput;

public class HomeWork3_6 {
    public static void main(String[] args) {
        UserInput ui= new UserInput();
        int n1=ui.inputInt("Enter first number.");
        int n2=ui.inputInt("Enter second number.");
        if(n1 < n2) {
            System.out.println("The first number is smaller - "+n1);
        } else {
            System.out.println("The second number is smaller - "+n2);
        }
    }
}
