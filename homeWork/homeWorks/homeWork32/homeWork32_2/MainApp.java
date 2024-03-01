package homeWorks.homeWork32.homeWork32_2;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        fillQueue(queue,10);
        System.out.println(queue);

        rotation(queue,3);
        System.out.println(queue);
    }
    public static void fillQueue(Queue<String> queue, int size){
        for(int i=0;i<size;i++){
            queue.add("Element "+i);
        }
    }
    public static void rotation(Queue<String> queue, int count){
        Deque<String> deque=new LinkedList<>(queue);
        queue.clear();
        while (!deque.isEmpty()){
            if(count>0){
                queue.add(deque.removeLast());
            }else{
                queue.add(deque.removeFirst());
            }
            count--;
        }
    }
}
