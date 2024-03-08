package homeWorks.homeWork36.collections.homeWork36_8;

import java.util.HashSet;
import java.util.LinkedList;

public class HomeWork36_8 {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=0;i<10;i++){
            set.add(i);
            list.add(i);
        }
        System.out.println(set);
        System.out.println(list);
        for(int i=0;i<10;i++){
            System.out.println(list.get(i));
        }
    }
}
