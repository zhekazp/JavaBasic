package homeWorks.homeWork29.homeWork29_4;

import homeWorks.homeWork29.homeWork29_4.services.ServiceHW29_4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap<>();

        students.put("Tom",3);
        students.put("Nick",2);
        students.put("Lisa",5);
        students.put("Anna",4);
        students.put("Marcus",3);

        System.out.println("Student who has the maximum score -"+ServiceHW29_4.getMax(students));

        students.replace("Lisa",4);

        System.out.println(students);

    }
}
