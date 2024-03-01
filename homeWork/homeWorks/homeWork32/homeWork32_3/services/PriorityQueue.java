package homeWorks.homeWork32.homeWork32_3.services;

import homeWorks.homeWork32.homeWork32_3.entitys.Task;

import java.util.Deque;
import java.util.LinkedList;

public class PriorityQueue {
    Deque<Task> tasks=new LinkedList<>();
    public void addTask(String name,int priority){
        Deque<Task> tempTasks=new LinkedList<>();
        boolean insert=true;
        if(tasks.isEmpty()){
            tempTasks.add(new Task(name,priority));
        }else {
             while (!tasks.isEmpty()) {
                Task temp=tasks.pollFirst();

                if (temp.getPriority() >= priority && insert) {
                    insert =false;
                    tempTasks.addLast(new Task(name, priority));

                }
                 tempTasks.add(temp);
             }
            if( insert){
                tempTasks.addLast(new Task(name, priority));
            }

        }
        tasks=tempTasks;
    }
    public Task getHiPriorityTask(){
        return tasks.pollLast();
    }



}
