package homeWorks.homeWork30.homeWork30_1;

import homeWorks.homeWork30.homeWork30_1.entetys.Flat;
import homeWorks.homeWork30.homeWork30_1.entetys.SortRules;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {
    public static void main(String[] args) {
        Comparator compareRules=new SortRules();
        Set<Flat> flats=new TreeSet<>(compareRules);

        flats.add(new Flat(4,120));
        flats.add(new Flat(4,100));
        flats.add(new Flat(3,70));
        flats.add(new Flat(3,60));
        flats.add(new Flat(2,50));
        flats.add(new Flat(2,43));
        flats.add(new Flat(1,30));
        System.out.println(flats);
    }
}
