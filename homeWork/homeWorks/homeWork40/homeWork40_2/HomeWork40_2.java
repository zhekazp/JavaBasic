package homeWorks.homeWork40.homeWork40_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork40_2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("12","123","1234","12345"));

        List<String> list2=list.stream()
                .filter(str->str.length()%2!=0)
                .toList();
        System.out.println(list2);
    }
}
