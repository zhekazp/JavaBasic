package homeWork1;

import classes.UserInput;

public class HomeWork1_1 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();

        double n1= ui.inputDouble("Enter first number");
        double n2= ui.inputDouble("Enter second number");

        System.out.println("Hear is what we can do with this numbers:");

        System.out.println(n1+"+"+n2+"="+(n1+n2));
        System.out.println(n1+"-"+n2+"="+(n1-n2));
        System.out.println(n1+"*"+n2+"="+(n1*n2));
        System.out.println(n1+"/"+n2+"="+(n1/n2));
    }


}
