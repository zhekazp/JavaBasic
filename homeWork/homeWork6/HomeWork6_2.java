package homeWork6;

import classes.UserInput;

public class HomeWork6_2 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();

        String str1=ui.inputText("Enter first string");
        String str2=ui.inputText("Enter second string");

        int l1=str1.length();
        int l2=str2.length();
        int middle2=Math.round((float)(l2)/2);

        System.out.println("New string contains firs part of firs string and second part of second string");
        System.out.println(str1.substring(0,l1/2)+str2.substring(middle2));
    }
}
