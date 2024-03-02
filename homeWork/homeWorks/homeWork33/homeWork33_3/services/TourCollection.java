package homeWorks.homeWork33.homeWork33_3.services;

import java.util.Deque;
import java.util.LinkedList;

public class TourCollection {
    private int maxSize;
    private Deque<String> tasks=new LinkedList<>();

    public TourCollection(int maxSize) {
        this.maxSize = maxSize;
    }
    public void addRequest(String newTask){
        if(tasks.size()<maxSize){
            tasks.add(newTask);
            System.out.println(newTask+" added.");
        }else{
            System.out.println("Error. "+newTask+" can`t be added. Tasks stack is full.");
        }
    }
    public void processRequest(){
        if(tasks.isEmpty()){
            System.out.println("Error. Tasks stack is empty.");
        }else{
            System.out.println("The task - "+tasks.pollFirst()+" is on work");
        }
    }
    public void getQueueSize(){
        System.out.println("The current size of task stack :"+tasks.size());
    }
}
