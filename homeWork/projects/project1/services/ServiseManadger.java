package projects.project1.services;

import projects.project1.entity.Task;
import projects.project1.entity.Tasks;

public class ServiseManadger {
    public void automaticFillTasks(Tasks task){
        String[] fields=new String[3];
        for (int i=0;i<10;i++){
            fields[0]=getRandomChar()+"Task - "+(i+1);
            fields[1]="Execution of task - "+(i+1);
            fields[2]=Integer.toString((int)(Math.random()*5)+1);
            createTask(fields,task);
        }
    }
    private char getRandomChar(){
        return (char) ((int)(Math.random()*25)+65);
    }
    public int createTask(String[] newTask,Tasks tasks){
        if(tasks.getCurrentId()==0){
            tasks.setCurrentId(1);
        }
        if(tasks.getCurrentId()-1<tasks.getMaxIds()){
            Task task=new Task(tasks.getCurrentId(),newTask[0],newTask[1],Integer.parseInt(newTask[2]));
            tasks.saveNewTask(task);
            tasks.setCurrentId(tasks.getCurrentId()+1);
            return tasks.getCurrentId();
        }else return -1;
    }
    public boolean taskComparison(Task task1,Task task2){
        boolean check=false;

        if (task1.getPriority()>task2.getPriority()){
            return true;
        }else{
            if(task1.getPriority()==task2.getPriority()){
                if(task1.getTaskTitle().compareTo(task2.getTaskTitle())>0){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }
}
