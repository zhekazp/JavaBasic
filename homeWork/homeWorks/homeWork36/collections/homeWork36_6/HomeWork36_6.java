package homeWorks.homeWork36.collections.homeWork36_6;

import java.util.ArrayDeque;

public class HomeWork36_6 {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(6);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
    }
}
