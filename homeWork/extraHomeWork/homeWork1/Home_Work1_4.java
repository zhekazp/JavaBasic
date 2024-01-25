package homeWork1;

import classes.UserInput;

public class Home_Work1_4 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        double cr=ui.inputDouble("Enter circle radius");
        System.out.println("Perimeter is "+2*cr*Math.PI);
        System.out.println("Area is  "+Math.pow(cr,2)*Math.PI);
    }
}
