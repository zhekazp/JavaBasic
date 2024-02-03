package homeWork14;

import homeWork14.classes.ManagerHW14_1;

import java.util.Arrays;

public class HomeWork14_1 {
    public static void main(String[] args) {
        int[] example1={1,2,3,5};
        int[] example2={6,1,2,8,3,4,7,10,5};
        int[] example3={18,2,16,3,1,5,4,10,7,9,20,15,11,14,13,12,17,8,6};
        int[] example4={7,6,5,4,3,2,1};
        ManagerHW14_1 testArray=new ManagerHW14_1();

        testArray.printResult(example1);
        testArray.printResult(example2);
        testArray.printResult(example3);
        testArray.printResult(example4);
    }
}
