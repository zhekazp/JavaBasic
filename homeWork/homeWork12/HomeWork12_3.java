package homeWork12;

import classes.UserInput;
import homeWork12.classes.Factorial;

public class HomeWork12_3 {
    public static void main(String[] args) {

        UserInput ui=new UserInput();
        Factorial factorial=new Factorial();

        System.out.println(factorial.calculateFactorial(ui.inputInt("Enter a number")));
    }
}
