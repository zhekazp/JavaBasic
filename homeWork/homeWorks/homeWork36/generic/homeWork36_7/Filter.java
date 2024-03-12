package homeWorks.homeWork36.generic.homeWork36_7;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Filter <T>{
    public ArrayList<T> filter(ArrayList<T> list, Predicate<T> test){
        ArrayList<T> newList=new ArrayList<>();
        list.forEach(T->{
            if(test.test(T)){
                newList.add(T);
            }
        });
        return newList;
    }
}
