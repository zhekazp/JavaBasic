package homeWorks.homeWork32.homeWork32_3;

import homeWorks.homeWork32.homeWork32_3.services.PriorityQueue;

public class MainApp {
    public static void main(String[] args) {
        PriorityQueue app=new PriorityQueue();
        app.addTask("Task1",5);
        app.addTask("Task2",2);
        app.addTask("Task4",4);
        app.addTask("Task5",1);
        app.addTask("Task6",6);
        while (!app.getTasks().isEmpty()){
            System.out.println(app.getHiPriorityTask());
        }
    }
}