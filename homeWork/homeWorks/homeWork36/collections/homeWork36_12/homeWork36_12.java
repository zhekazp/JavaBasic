package homeWorks.homeWork36.collections.homeWork36_12;


import java.util.PriorityQueue;

public class homeWork36_12 {
    public static void main(String[] args) {


        PriorityQueue<Task> tasks=new PriorityQueue<>();

        tasks.add(new Task("task",7));
        tasks.add(new Task("task2",4));
        tasks.add(new Task("task3",1));
        tasks.add(new Task("task4",5));
        tasks.add(new Task("task5",3));
        while(!tasks.isEmpty()){
            System.out.println(tasks.poll());
        }
    }
   static class Task implements Comparable<Task>{
        String name;
        int priority;

        public Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public int getPriority() {
            return priority;
        }

       @Override
       public String toString() {
           return "Task{" +
                   "name='" + name + '\'' +
                   ", priority=" + priority +
                   '}';
       }

       @Override
        public int compareTo(Task o) {
            return priority-o.getPriority();
        }
    }

    }
