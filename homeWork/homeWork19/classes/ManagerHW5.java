package homeWork19.classes;

import classes.UserInput;

import java.util.Arrays;

public class ManagerHW5 {
    private int [] array;
    private int [] array2;
    private boolean[] check;
    private int n=0;

    public int[] getArray() {
        return array;
    }

    public ManagerHW5() {
        UserInput ui=new UserInput();
        while (n<4){
            n=ui.inputInt("Enter a length of new array (number must be bigger then 3)");

            if(n<4){
                System.out.println("You entered wrong number.");
                System.out.println("Repeat please.");
                System.out.println();
            }
        }
        array=new int[n];
        fillArray();
    }

    private void fillArray(){
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)(Math.random()*(n+1));
        }
    }
    public void printArray(int[] array,String text,String text2){
        if(array.length>0) {
            System.out.println(text);
            System.out.println(Arrays.toString(array));
            System.out.println();
        }else{
            System.out.println(text2);
        }
    }

    public int[] evenNumbersArray(int[] array){
        int count=checkEven();
        array2=new int[count];
        int index=0;
        for (int i=0;i<check.length;i++){
            if(check[i]){
                array2[index]=array[i];
                index++;
            }
        }
        return array2;
    }
    private int checkEven(){
        check=new boolean[array.length];
        int count=0;
        for (int i=0;i<array.length;i++){
            if (array[i] % 2 == 0){
                check[i]=true;
                count++;
            }
        }
        return count;
    }

}
