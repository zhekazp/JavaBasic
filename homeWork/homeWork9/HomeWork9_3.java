package homeWork9;

import classes.UserInput;

public class HomeWork9_3 {
    public static void main(String[] args) {
        UserInput u1=new UserInput();
        int i=u1.inputInt("Enter a number in interval from 1 to 7");
        switch (i){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
        }
    }
}
