package homeWorks.homeWork29.homeWork29_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        Set<String> names=new HashSet<>();
        names.add("name1");
        names.add("name2");
        names.add("name1");
        names.add("name3");
        names.add("name4");
        names.add("name1");
        names.add("name2");
        names.add("name5");
        names.add("name1");
        names.add("name4");


        System.out.println("The number of unique names -" + names.size());

        String searchName="name45";

        System.out.println("The set "+(names.contains(searchName)? "":"does not ")
                +"contains - "+searchName);
    }
}
