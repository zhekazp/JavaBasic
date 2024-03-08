package homeWorks.homeWork36.collections.homeWork36_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeWork36_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,4,7,8,5,2,1,34,4,6));
        Collections.sort(list);
        System.out.println(list);
    }

}
