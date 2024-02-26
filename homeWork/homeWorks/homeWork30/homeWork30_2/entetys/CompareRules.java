package homeWorks.homeWork30.homeWork30_2.entetys;

import java.util.Comparator;

public class CompareRules implements Comparator<Suitcase> {
    @Override
    public int compare(Suitcase o1, Suitcase o2) {
       int result= o1.getSize().compareTo(o2.getSize());
       if(result==0){
           result=o1.getColor().compareTo(o2.getColor());
       }
        if(result==0){
            result=o1.getMateriel().compareTo(o2.getMateriel());
        }
        return result;
    }
}
