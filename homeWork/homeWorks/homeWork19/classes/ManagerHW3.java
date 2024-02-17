package homeWorks.homeWork19.classes;

import java.util.Arrays;

public class ManagerHW3 {
    private int[] array= new int[8];

    public ManagerHW3() {
        for (int i=0;i<array.length;i++){
            array[i]=(int)(Math.random()*9)+1;
        }
    }
    public void printArray(){
        System.out.println("Here is a new array");
        System.out.println(Arrays.toString(array));
    }

    public void sort(){
        int counter=array.length-1;
        int temp;
        boolean end=false;
        while (!end){
            for(int i=0;i<counter;i++){
                if(array[i]>array[i+1]){
                    temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                  }
            }
            counter--;
            if(counter==0){
                end=true;
            }
        }
        System.out.println("Here is a sorted array (bubble method)");
        System.out.println(Arrays.toString(array));
    }

}
