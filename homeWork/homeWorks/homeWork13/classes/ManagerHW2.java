package homeWorks.homeWork13.classes;

import java.util.Arrays;

public class ManagerHW2 {
    private int[] numbers=new int[5];
    public ManagerHW2() {
        for (int i=0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*90)+10;
        }
    }
    public String printArray(){
        return Arrays.toString(numbers);
    }
    public boolean testIncrease(){
        for (int i=0;i<numbers.length-1;i++){
            if (numbers[i]>=numbers[i+1]){
                return false;
            }
        }
        return true;
    }
}
