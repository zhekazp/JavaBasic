package homeWorks.homeWork14.classes;

import java.util.Random;

public class ManagerHW14_3 {
    private int min=0;
    private int max=9;
    private int arrayLength=15;

    public int[] createArray(){
        int [] newArray= new int[arrayLength];
        Random rnd=new Random();
        for (int i = 0; i < arrayLength; i++) {
            newArray[i]= rnd.nextInt(min,max+1);
        }
        return newArray;
    }
    public int countEven(int[] array){
        int count=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2 == 0){
                count++;
            }
        }
        return count;
    }
    public void printArray(int[] array){
        for (int i=0;i<array.length-2;i++){
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1]);
    }
}
