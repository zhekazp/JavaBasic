package homeWorks.homeWork29.homeWork29_6;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(4,6,7,4,6,7,4,7,8,6,4));
        Set<Integer> set=new HashSet<>(list);

        System.out.println(set);

        set.add(1);
        list.clear();
        list.addAll(set);
        System.out.println(list);
    }
}
