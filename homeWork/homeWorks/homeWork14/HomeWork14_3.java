package homeWorks.homeWork14;

import homeWorks.homeWork14.classes.ManagerHW14_3;

public class HomeWork14_3 {
    public static void main(String[] args) {
        ManagerHW14_3 arrayEven=new ManagerHW14_3();

        int[] array=arrayEven.createArray();
        arrayEven.printArray(array);
        System.out.println("In random array "+arrayEven.countEven(array)+" even numbers");
    }
}
