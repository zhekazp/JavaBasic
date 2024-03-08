package homeWorks.homeWork36.generic.homeWork36_5;

import java.util.Collections;
import java.util.List;

public class MargeLists<T extends Comparable<? super T>> {
    public List<T> marge(List<T> list1, List<T> list2){
        list1.addAll(list2);
        Collections.sort(list1);
        return list1;
    }

}
