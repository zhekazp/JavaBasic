package homeWorks.homeWork14;

import homeWorks.homeWork14.classes.ManagerHW14_2;

public class HomeWork14_2 {
    public static void main(String[] args) {

        ManagerHW14_2 oddArray = new ManagerHW14_2();

        oddArray.getInterval();
        int[] array= oddArray.getOddArray();
        oddArray.printDecreasing(array);
    }
}
