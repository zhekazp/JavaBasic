package homeWorks.homeWork13;

import homeWorks.homeWork13.classes.ManagerHW2;

public class HomeWork13_2 {
    public static void main(String[] args) {
        ManagerHW2 a=new ManagerHW2();

        System.out.println(a.printArray());

        if (a.testIncrease()){
            System.out.println("The array is increasing");
        }else {
            System.out.println("The array is not increasing");
        }
    }
}
