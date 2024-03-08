package homeWorks.homeWork36.collections.homeWork36_15;

import java.util.HashSet;

public class homeWork36_15 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("aaa");
        set.add("bab");
        set.add("ccc");
        set.add("abc");
        HashSet<String> set2=new HashSet<>();
        set2.add("ccc");
        set2.add("ddd");
        set2.add("bab");
        set2.add("abc");
        System.out.println(set);
        System.out.println(set2);
        for (String str : set){
            if(set2.contains(str)){
                System.out.println(str);
            }
        }
    }
}
