package projects.project1.services;

import classes.UserInput;

public class UserTalkService {
    UserInput ui= new UserInput();
    public void menu(){
        System.out.println("Menu");
        System.out.println();
        System.out.println("1: New Task");
        System.out.println();
        System.out.println("2: Edit status");
        System.out.println();
        System.out.println("3: Sort Tasks");
        System.out.println();
        System.out.println("4: Print all Tasks");
        System.out.println();
        System.out.println("5: Exit");
        System.out.println();
    }
    public int answer(){
        int i= ui.inputPositiveInt("Enter you choose");
        System.out.println();
        if (i>0 && i<6){
            return i;
        }else {
            return -1;
        }
    }
    public void error(){
        System.out.println("You entered wrong data, please be careful!");
        System.out.println();
    }
    public String[] getNewTask(){
        String[] newTask=new String[3];
        System.out.println();
        System.out.println("New Task");
        newTask[0]= ui.inputText("Enter a task Title");
        newTask[1]= ui.inputText("Enter a task Description");
        int answer=0;
        while (answer<1 || answer>5){
            answer= ui.inputPositiveInt("Enter a priority of the Task (1-5). 1 is highest");
            if(answer<1 || answer>5){
               error();
            }
        }
        newTask[2]=Integer.toString(answer);
        return newTask;
    }
    public void reportTaskCreation(int id){
        if(id==-1){
            System.out.println("Error - the tasks container is full.");
            System.out.println();
        } else {
            System.out.println("New task has been registered and has id - "+id);
            System.out.println();
        }
    }
    public void reportSort(){
        System.out.println("Your tasks are sorted");
        System.out.println();
    }
    public int getStatusId(int currentId){
        if(currentId==2){
            return 1;
        }else {
            if (currentId == 0) {
                System.out.println("You d`ont have any tasks");
                System.out.println();
                return -1;
            } else {
                System.out.println("You have " + (currentId-1) + " tasks.");
                System.out.println();
                int result = 0;
                while (result < 1 || result > (currentId-1)) {
                    result = ui.inputPositiveInt("what task did you complete : 1-" + (currentId - 1));
                    if (result < 1 || result > (currentId-1)) {
                        error();
                    }
                }
                return result;
            }
        }
    }
}
