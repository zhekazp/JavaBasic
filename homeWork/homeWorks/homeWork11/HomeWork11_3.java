package homeWorks.homeWork11;

import classes.UserInput;

public class HomeWork11_3 {
    public static void main(String[] args) {
        UserInput ui = new UserInput();
        boolean test = true;
        int result=0;

        while (test){
            int n=ui.inputInt("Enter next number");
            if (n>=0){
                result+=n;
            }else{
                test=false;
            }
        }
        System.out.println("Result is "+result);
    }
}
