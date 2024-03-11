package homeWorks.homeWork38.homeWork6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork6 {
    public static void main(String[] args) {
        Connection<Integer> connection= List::addAll;
        List<Integer> list1=new ArrayList<>(Arrays.asList(3,5,3,4,5));
        List<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        connection.connect(list1,list2);
        System.out.println(list1);
    }
}
