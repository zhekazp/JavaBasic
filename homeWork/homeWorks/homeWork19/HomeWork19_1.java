package homeWorks.homeWork19;

import homeWorks.homeWork19.classes.ManagerHW1;

import java.util.Arrays;

public class HomeWork19_1 {
    public static void main(String[] args) {
        ManagerHW1 manager= new ManagerHW1();
        String[] str =manager.newArray(19);

        System.out.println("This is old array: ");
        System.out.println(Arrays.toString(str));

        manager.changeElements(str);

        System.out.println("This is old array: ");
        System.out.println(Arrays.toString(str));
 }
}
