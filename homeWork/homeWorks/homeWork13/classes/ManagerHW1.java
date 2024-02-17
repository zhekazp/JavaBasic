package homeWorks.homeWork13.classes;

import java.util.Arrays;

public class ManagerHW1 {
private int[] numbers=new int[8];

    public ManagerHW1() {
        for (int i=0;i<numbers.length;i++){
            numbers[i]=(int)(Math.random()*50)+1;
        }
    }
    public String printArray(){
                return Arrays.toString(numbers);
    }

    public void changeOdd(){
        for (int i=0;i<numbers.length;i++){
            if( (numbers[i]%2) != 0){
                numbers[i]=0;
            }
        }
    }
}
