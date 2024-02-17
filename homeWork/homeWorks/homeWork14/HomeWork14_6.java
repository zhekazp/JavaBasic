package homeWorks.homeWork14;

import homeWorks.homeWork14.classes.ManagerHW14_6;

import java.util.Arrays;

public class HomeWork14_6 {
    public static void main(String[] args) {
        String[] strings = {"12","1234","12345","12345678","1234567","123456789","123",
        "1234567890"};
        System.out.println(Arrays.toString(strings));

        ManagerHW14_6 ma=new ManagerHW14_6();

        String[] strOdd=ma.createOddStringArray(strings);
        System.out.println("Here is an array with string that have odd length");
        System.out.println(Arrays.toString(strOdd));

        String[] strEven=ma.createEvenStringArray(strings);
        System.out.println("Here is an array with string that have even length");
        System.out.println(Arrays.toString(strEven));
    }
}
