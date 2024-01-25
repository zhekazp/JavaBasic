package homeWork1;

import classes.UserInput;

public class HomeWork1_5 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        int n1=ui.inputInt("Enter first number :");
        int n2=ui.inputInt("Enter second number :");
        int n3=ui.inputInt("Enter third number :");
        System.out.println("Average value is "+(double)((n1+n2+n3))/3);
    }
}
