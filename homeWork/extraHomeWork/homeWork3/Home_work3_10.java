package homeWork3;

import classes.UserInput;

public class Home_work3_10 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int n1 = ui.inputInt("Enter first number.");
        int n2 = ui.inputInt("Enter second number.");
        int n3 = ui.inputInt("Enter third number.");
        if (n1 > n2 && n1 > n3) {
            System.out.println("The first number is the biggest - "+n1);
        } else if (n2 > n3) {
            System.out.println("The second number is the biggest - "+n2);
        } else {
            System.out.println("The third number is the biggest - "+n3);
        }
    }
}
