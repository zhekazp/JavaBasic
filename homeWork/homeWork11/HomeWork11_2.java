package homeWork11;

import classes.UserInput;

public class HomeWork11_2 {
    public static void main(String[] args) {
        UserInput ui=new UserInput();
        int n=ui.inputInt("Enter a number");
        boolean test=true;

        for (int i=1;i<=n;i++){
            if ((i != 1) && (i !=n)){
                if( (n%i) == 0 ){
                    test=false;
                    break;
                }
            }
        }

        if(test){
            System.out.println("Number is ease");
        }else{
            System.out.println("Number is not ease");
        }
    }
}
