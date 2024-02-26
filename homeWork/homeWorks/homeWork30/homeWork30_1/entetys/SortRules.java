package homeWorks.homeWork30.homeWork30_1.entetys;

import java.util.Comparator;

public class SortRules implements Comparator<Flat> {
    @Override
    public int compare(Flat o1, Flat o2) {
        int result=o1.getRooms()- o2.getRooms();
        if(result==0){
            result=o1.getSquare()-o2.getSquare();
        }
        return result;
    }
}
