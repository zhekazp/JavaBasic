package homeWork14.classes;

import classes.UserInput;

import java.util.Arrays;
import java.util.Random;

public class ManagerHW14_7 {
private int[] array;
private int[] maxVs;
private int maxIndex;
private int max;
private int maxCount=0;
private int sum;
private int length;

    public ManagerHW14_7() {
        UserInput ui=new UserInput();
        length =ui.inputInt("Enter the array length");
        array=fillArray();
        getMaximum();
        getArrayMax();
    }
    public void printArray(){
        System.out.println("Here is random array :"+ Arrays.toString(array));
        System.out.println();
    }
    public void printMaximum(){
        System.out.println("The maximum element of array has value : "+max);
        System.out.println("and first index : "+ maxIndex);
        System.out.println();
    }
    public void printSum(){
        System.out.println("The sum of elements is : "+sum);
        System.out.println();
    }
    public void printMaxElements(){
        if(maxCount==1){
            System.out.println("The array has only one max element");
        }else {
            System.out.println("The array has "+maxCount+" max element");
            System.out.println("Here are there indexes :"+Arrays.toString(maxVs));
        }
    }
    private void getArrayMax(){
        maxVs=new int[maxCount];
        int j=0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]==max){
                maxVs[j]=i;
                j++;
            }
        }}
    private void getMaximum(){
        for (int i=0;i<array.length;i++){
            if(array[i]==max){
                maxCount++;
            }
            if (array[i]>max){
                max=array[i];
                maxIndex=i;
                maxCount=1;
            }
            sum+=array[i];
        }

    }
    private int[] fillArray(){
        int [] newArray=new int[length];
        Random rnd=new Random();
        for (int i=0;i<newArray.length;i++){
            newArray[i]=rnd.nextInt(100);
        }
        return newArray;
    }
}
