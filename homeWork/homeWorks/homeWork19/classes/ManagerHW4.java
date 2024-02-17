package homeWorks.homeWork19.classes;

import java.util.Arrays;

public class ManagerHW4 {
    int[] arr1=new int[5];
    int[] arr2=new int[5];
    private int avarage1;
    private int avarage2;

    public ManagerHW4() {
        avarage1=fillArray(arr1);
        avarage2=fillArray(arr2);
        System.out.println("Application created 2 random arrays :");
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
    }
    private int fillArray(int[] array){
        int sum=0;
        for (int i = 0; i <array.length ; i++) {
            array[i]=(int)(Math.random()*5)+1;
            sum+=array[i];
        }
        return sum/array.length;
    }
    public void chack(){
        System.out.println("Here are averages of the elements of arrays");
        System.out.println("The first average : "+avarage1);
        System.out.println("The first average : "+avarage2);
        if (avarage2>avarage1){
            System.out.println("The average of the elements of the second array is bigger then average of the first array");
        }else{
            if (avarage2<avarage1){
                System.out.println("The average of the elements of the first array is bigger then average of the second array");
            }else{
                System.out.println("Averages of the elements of both arrays are equal");
            }
        }
    }
}
