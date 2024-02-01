package homeWork11;

import classes.UserInput;

public class HomeWork11_2 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        int n=ui.inputInt("Enter an integer number");
        boolean test=true;

        for (int i=2;i<n;i++){
                    if( (n%i) == 0 ){
                    test=false;
                    break;
                }

        }

        if(test){
            System.out.println("Number is simple");
        }else{
            System.out.println("Number is not simple");
        }
    }
}
