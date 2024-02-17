package homeWorks.homeWork12.classes;

import classes.UserInput;

public class Numbers {
    UserInput ui=new UserInput();
    public void getNumbers(){
        int sum=0;
        int numQuentety=0;
        boolean check=true;
        while (check){
            int number= ui.inputInt("Enter next number");
            if(number!=0){
            sum +=number;
            numQuentety++;
               }else{
                check=false;

            }
        }
        System.out.println("The sum is : "+sum);
        System.out.println("The average number is : "+ (sum/numQuentety));
    }
}
