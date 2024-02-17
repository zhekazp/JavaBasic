package homeWorks.homeWork9;

import classes.UserInput;

public class HomeWork9_1 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        int i=ui.inputInt("Enter a number in interval from 1 to 3");
        if(i==1) {
            System.out.println("You number is 1");
        }else if(i==2){
            System.out.println("You number is 2");
        }else {
            System.out.println("You number is 3");
        }
        switch (i){
            case 1:
                System.out.println("You number is 1");
                break;
            case 2:
                System.out.println("You number is 2");
                break;
            case 3:
                System.out.println("You number is 3");
                break;
        }
    }
}
