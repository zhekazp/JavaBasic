package homeWorks.homeWork36.collections.homeWork36_5;

import java.util.Stack;

public class HomeWork36_5 {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(9);
        integers.push(10);
        integers.push(11);
        System.out.println(integers.search(1));
    }
}
