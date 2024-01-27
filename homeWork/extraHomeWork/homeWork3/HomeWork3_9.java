package homeWork3;

import classes.UserInput;

public class HomeWork3_9 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        int n1 = ui.inputInt("Enter first number.");
        int n2 = ui.inputInt("Enter second number.");
        int n3 = ui.inputInt("Enter third number.");
        if (n1 > n2 && n2 > n3) {
            System.out.println("decreasing");
        } else if (n1 < n2 && n2 < n3) {
            System.out.println("increasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
