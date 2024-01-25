package homeWork6;

import classes.UserInput;

public class Home_work6_4 {
    public static void main(String[] args) {
        String s1="Java";
        System.out.println(s1);

        String s2="Java";
        System.out.println("My name is "+s2);

        UserInput ui=new UserInput();
        String s3=ui.inputText("Enter your name");
        System.out.println("Hello "+s3);
    }
}
