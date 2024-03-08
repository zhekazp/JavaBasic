package homeWorks.homeWork36.collections.homeWork36_10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class HomeWork36_10 {
    public static void main(String[] args) throws ParseException {
        TreeMap<Date, List<String>> map=new TreeMap<>();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        map.put(format.parse("01.02.1999"),new ArrayList<>(List.of("first")));
        map.put(format.parse("01.02.1980"),new ArrayList<>(List.of("second")));
        map.put(format.parse("01.02.2024"),new ArrayList<>(List.of("third")));

        for(List<String> list:map.values()){
            System.out.println(list);
        }

    }
}
