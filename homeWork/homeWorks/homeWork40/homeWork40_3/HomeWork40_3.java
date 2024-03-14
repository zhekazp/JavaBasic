package homeWorks.homeWork40.homeWork40_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork40_3 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("12", "34", "567", "890"));

        String newstr = list.stream()
                .reduce((str1,str2)->str1+str2).orElse("Empty list");
        System.out.println(newstr);
    }
}
