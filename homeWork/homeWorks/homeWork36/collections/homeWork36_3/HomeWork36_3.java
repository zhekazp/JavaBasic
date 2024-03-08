package homeWorks.homeWork36.collections.homeWork36_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;

public class HomeWork36_3 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < 11; i++) {
            map.put(i, i * i);
        }
        System.out.println(map);

        HashSet<String> set = new HashSet<>();
        set.add("aaa");
        set.add("bbb");
        System.out.println(set.contains("aaa"));

        TreeMap<String,Integer> tMap=new TreeMap<>();
        for (int i = 1; i < 11; i++) {

            String key="string"+i+((int)(Math.random()*1000000));
            tMap.put(key,key.length());
        }
        System.out.println(tMap);
    }
}
