package homeWorks.homeWork36.collections.homeWork36_9;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork36_9 {
    public static void main(String[] args) {
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student("Alex",3.5));
        students.add(new Student("Tom",2.5));
        students.add(new Student("Bill",1.5));
        students.add(new Student("Tina",4.5));
        Collections.sort(students);
        System.out.println(students);
    }
}
