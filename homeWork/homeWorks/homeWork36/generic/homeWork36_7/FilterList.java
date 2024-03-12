package homeWorks.homeWork36.generic.homeWork36_7;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(5,7,8,4));
        Filter<Integer> filter=new Filter<>();
        ArrayList<Integer> newList=filter.filter(list,a->a%2==0);
        System.out.println(newList);
    }

}
