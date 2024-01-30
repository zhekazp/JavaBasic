package homeWork11;

import classes.UserInput;

public class HomeWork11_1 {
    public static void main(String[] args) {
        UserInput ui= new UserInput();
        int n=ui.inputInt("Enter a number");
        int result=0;

        for (int i=0;i<=n;i++){
            if((i%2) == 0) {
                result+=i;
            }
        }
        System.out.println("The result of adding even numbers = "+result);
    }
}
