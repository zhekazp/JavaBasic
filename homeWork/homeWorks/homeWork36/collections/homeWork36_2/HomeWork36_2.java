package homeWorks.homeWork36.collections.homeWork36_2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HomeWork36_2 {
    public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(5, 4, 7, 8, 5, 2, 1, 34, 4, 6));
        Set<Integer> set = new HashSet<>(Arrays.asList(4, 5, 3, 1));
        for (Integer i : set){
            list.remove(Integer.parseInt(i.toString()));
        }
        System.out.println(list);
    }
}
