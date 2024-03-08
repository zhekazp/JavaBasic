package homeWorks.homeWork36.collections.homeWork36_4;


import java.util.PriorityQueue;

public class HomeWork36_4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(10);
        queue.add(4);
        queue.add(7);
        queue.add(1);
        queue.add(3);
        System.out.println(queue.poll());


    }
}
