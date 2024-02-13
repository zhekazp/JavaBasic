package projects.project1.services;

import projects.project1.entity.Task;
import projects.project1.entity.Tasks;

public class TaskManager {
    Tasks calendar;
    ServiseManadger servise= new ServiseManadger();

    public TaskManager(int maxValueOfTasks,boolean automatic) {
        calendar=new Tasks(maxValueOfTasks);
        if (automatic){
            servise.automaticFillTasks(calendar);
        }
    }

    public int createTaskFromUserInput(String[] newTask){
         return servise.createTask(newTask,calendar);
    }
    public void changeStatus(int id){
        for (int i=0; i<calendar.getCurrentId()-1;i++){
            if(calendar.getTasks()[i].getId()==id){
                calendar.getTasks()[i].changeStatus();
                break;
            }
        }
    }
    public void sort(){
        int currentElemtnt=calendar.getCurrentId()-1;

        while (currentElemtnt>0){
            for(int i=0;i<currentElemtnt-1;i++){
                if(servise.taskComparison(calendar.getTasks()[i], calendar.getTasks()[i+1])){
                    Task temp=calendar.getTasks()[i+1];
                    calendar.getTasks()[i+1]=calendar.getTasks()[i];
                    calendar.getTasks()[i]=temp;
                }
            }
            currentElemtnt--;
        }
    }

    public void printTasks(){
        System.out.println("Here are all Tasks:");
        System.out.println();
        for (int i=0; i<calendar.getCurrentId()-1;i++){
            System.out.println("Task id - "+calendar.getTasks()[i].getId());
            System.out.println();
            System.out.println("Task title - "+calendar.getTasks()[i].getTaskTitle());
            System.out.println();
            System.out.println("Task  description- "+calendar.getTasks()[i].getTaskDescription());
            System.out.println();
            System.out.println("Task  priority- "+calendar.getTasks()[i].getPriority());
            System.out.println();
            System.out.println("Task  status- "+calendar.getTasks()[i].getStatus());
            System.out.println();
            System.out.println("==========================================================");
        }
    }


}
