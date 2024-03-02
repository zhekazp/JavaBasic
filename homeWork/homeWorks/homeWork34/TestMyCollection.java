package homeWorks.homeWork34;

import homeWorks.homeWork34.classes.MyLinkedList;

import java.util.LinkedList;

public class TestMyCollection {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();

        System.out.println("Выводим пустой лист");
        System.out.println(list);

        System.out.println("Выводим элемент пустого листа");
        System.out.println(list.get(0));

        System.out.println("Удаляем элемент из пустого листа");
        list.remove(0);

        System.out.println("Добавляем элемент по индексу");
        list.add(0,25);

        System.out.println("Выводим лист");
        System.out.println(list);
        System.out.println("Добавляем элементы");
        list.add(35);
        list.add(45);
        System.out.println("Добавляем элемент по не существующему индексу");
        list.add(34,45);
        System.out.println(list);
        System.out.println("Добавляем элемент по индексу в середину");
        list.add(1,100);
        System.out.println(list);

        System.out.println("Выводим элементы по индексам");
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("Удаляем элементы по индексам");
        list.remove(5);
        list.remove(1);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.remove(list.size()-1);
        System.out.println(list);

        System.out.println(list.size());


    }
}
