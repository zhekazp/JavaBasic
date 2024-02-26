package homeWorks.homeWork30.homeWork30_2;

import homeWorks.homeWork30.homeWork30_2.entetys.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainApp {
    public static void main(String[] args) {
        Set<Suitcase> suitcases=new TreeSet<>();
        List<Suitcase> suitcasesLList=new LinkedList<>();

        suitcases.add(new Suitcase(Size.L, Color.Blue, Materiel.Fabric));
        suitcases.add(new Suitcase(Size.Xl, Color.Red, Materiel.Plastic));
        suitcases.add(new Suitcase(Size.M, Color.Black, Materiel.Fabric));
        suitcases.add(new Suitcase(Size.L, Color.Red, Materiel.Fabric));
        suitcases.add(new Suitcase(Size.M, Color.Grey, Materiel.Plastic));
        suitcases.add(new Suitcase(Size.M, Color.Grey, Materiel.Fabric));

        suitcasesLList.add(new Suitcase(Size.L, Color.Blue, Materiel.Fabric));
        suitcasesLList.add(new Suitcase(Size.Xl, Color.Red, Materiel.Plastic));
        suitcasesLList.add(new Suitcase(Size.M, Color.Black, Materiel.Fabric));
        suitcasesLList.add(new Suitcase(Size.L, Color.Red, Materiel.Fabric));
        suitcasesLList.add(new Suitcase(Size.M, Color.Grey, Materiel.Plastic));
        suitcasesLList.add(new Suitcase(Size.M, Color.Grey, Materiel.Fabric));

        suitcasesLList.sort(new CompareRules());
        System.out.println(suitcases);
        System.out.println(suitcasesLList);
    }
}
