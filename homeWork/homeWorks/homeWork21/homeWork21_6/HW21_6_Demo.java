package homeWorks.homeWork21.homeWork21_6;

import homeWorks.homeWork21.homeWork21_6.entitys.Developer;
import homeWorks.homeWork21.homeWork21_6.entitys.Employee;
import homeWorks.homeWork21.homeWork21_6.entitys.Manager;

public class HW21_6_Demo {
    public static void main(String[] args) {
        Manager manager=new Manager("Nick",35,2500);
        Developer developer=new Developer("Luck",25,2000);
        Employee[] employees={manager,developer};

        manager.saveEmployees(employees);
        manager.printEmployees();

        String[] projects={"project1","project2"};
        developer.saveTasks(projects);
        developer.printProjects();



    }
}
