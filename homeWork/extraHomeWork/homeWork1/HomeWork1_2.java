package homeWork1;

import classes.UserInput;

public class HomeWork1_2 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        String name=ui.inputText("Enter your name");
        System.out.println("Hello "+name+"!");
    }

}
