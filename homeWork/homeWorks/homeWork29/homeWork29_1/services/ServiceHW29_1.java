package homeWorks.homeWork29.homeWork29_1.services;

import java.util.List;
import java.util.Objects;

public class ServiceHW29_1 {
    public static void reversePrint(List list){
        System.out.println("Reverse list of students");
        for (int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
        System.out.println("===================");
    }
    public static void printStudents(List list){
        System.out.println("List of students");
        for (Object name: list){
            System.out.println(name);
        }
        System.out.println("===================");
    }
}
