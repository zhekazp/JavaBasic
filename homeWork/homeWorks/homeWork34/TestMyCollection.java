package homeWorks.homeWork34;

import homeWorks.homeWork34.classes.MyLinkedList;

import java.util.LinkedList;

public class TestMyCollection {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();

        System.out.println("Print empty list");
        System.out.println(list);

        System.out.println("Print element of empty list");
        System.out.println(list.get(0));

        System.out.println("Remove element of empty list");
        list.remove(0);

        System.out.println("Add element by index");
        list.add(0,25);


        System.out.println("Print list");
        System.out.println(list);
        System.out.println("Add elements");
        list.add(35);
        list.add(45);
        System.out.println("Add elements with wrong index");
        list.add(34,45);
        System.out.println(list);
        System.out.println("Add element in middle of list by index");
        list.add(1,100);
        System.out.println(list);
        System.out.println("Print size of the list");
        System.out.println(list.size());
        System.out.println("Print elements by index");
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("Remove elements by index");
        list.remove(5);
        list.remove(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
    }
}
