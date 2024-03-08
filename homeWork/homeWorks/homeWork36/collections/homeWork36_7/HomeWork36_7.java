package homeWorks.homeWork36.collections.homeWork36_7;

import java.util.TreeMap;

public class HomeWork36_7 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for (int i=1;i<11;i++) {
            map.put(i, getFactorial(i));
        }
        System.out.println(map);
    }
    static Integer getFactorial(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n*getFactorial(n - 1);
        }
    }
}
