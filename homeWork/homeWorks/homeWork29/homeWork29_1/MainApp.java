package homeWorks.homeWork29.homeWork29_1;

import java.util.ArrayList;
import java.util.List;
import homeWorks.homeWork29.homeWork29_1.services.ServiceHW29_1;
public class MainApp {
    public static void main(String[] args) {
        List<String> students=new ArrayList<>();
        students.add("Tom");
        students.add("Lisa");
        students.add("Philip");
        students.add("Nina");
        students.add("Kate");

        ServiceHW29_1.reversePrint(students);

        students.remove(3);

        ServiceHW29_1.printStudents(students);

    }
}
