package homeWorks.homeWork11;

import classes.UserInput;

public class HomeWork11_5 {
    public static void main(String[] args) {

    UserInput ui= new UserInput();
    int n=ui.inputInt("Enter a number");
    int sumEven=0;
    int sumOdd=0;

        for (int i=0;i<=n;i++){
        if((i%2) == 0) {
            sumEven+=i;
        }else {
            sumOdd+=i;
        }
    }
        System.out.println("The result of adding even numbers = "+sumEven);
        System.out.println("The result of adding even numbers = "+sumOdd);
    }
}
