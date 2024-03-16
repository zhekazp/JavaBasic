package homeWorks.homeWork36.collections.homeWork36_14;

import java.sql.Time;
import java.time.LocalTime;
import java.util.*;


public class homeWork36_14 {
    public static void main(String[] args) {
        LinkedHashMap<LocalTime, List<String>> map=new LinkedHashMap<>();
        map.put(LocalTime.of(20,20), new ArrayList<>(Arrays.asList("20","20")));
        map.put(LocalTime.of(10,20), new ArrayList<>(Arrays.asList("10","20")));
        map.put(LocalTime.of(20,15), new ArrayList<>(Arrays.asList("20","15")));
        map.put(LocalTime.of(7,50), new ArrayList<>(Arrays.asList("7","50")));

        List<LocalTime> keys=new ArrayList<>(map.keySet());
        keys.sort(LocalTime::compareTo);
        for(LocalTime time: keys){
            System.out.println(map.get(time));
        }

    }
}
