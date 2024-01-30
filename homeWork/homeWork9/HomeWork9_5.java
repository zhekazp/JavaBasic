package homeWork9;

import classes.UserInput;
import homeWork9.classes.UtilHW_5;

public class HomeWork9_5 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        UtilHW_5 test=new UtilHW_5();

        String num=ui.inputText("Enter four digit number");
        boolean checkNumber;

        if (num.length()!=4){
           checkNumber=false;
        } else{
            checkNumber=test.isDigit(num.charAt(0)) && test.isDigit(num.charAt(1)) &&
                    test.isDigit(num.charAt(2)) && test.isDigit(num.charAt(3));
        }
        if (checkNumber){
            test.getLucky(num);
        }else {
            System.out.println("You entered incorrect string");
        }
    }
}
