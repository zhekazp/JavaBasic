package homeWork14.classes;

import classes.UserInput;

public class ManagerHW14_2 {
    private int min;
    private int max;
    public void getInterval(){
        UserInput ui=new UserInput();
        System.out.println("Enter interval (start must be >0)");
        min= ui.inputInt("Begin : ");
        max= ui.inputInt("End : ");
    }
    public int[] getOddArray(){
       int[] numbers=new int[(max-min)/2+1];
        int j=0;
        for (int i=min;i<=max;i++){
            if(i%2 != 0){
            numbers[j]=i;
            j++;
            }
        }
        return numbers;
    }
    public void printDecreasing(int[] array){
        for (int i=array.length-1;i>0;i--){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[0]);
    }
}
