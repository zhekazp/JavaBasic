package homeWorks.homeWork40.homeWork40_7;

import java.util.ArrayList;
import java.util.List;

public class HomeWork40_7 {
    public static void main(String[] args) {


        List<Person> list = new ArrayList<>();
        list.add(new Person("Person1","M",1300,35));
        list.add(new Person("Person2","M",1500,45));
        list.add(new Person("Person3","W",1700,35));
        list.add(new Person("Person4","W",1900,35));
        list.add(new Person("Person5","M",2300,20));
        list.add(new Person("Person6","M",2400,39));
        Integer sumSalary=0;
        Integer i=0;
        System.out.println(list.stream().filter(person -> person.getAge()>=25 && person.getAge()<=40)
                .mapToDouble(Person::getSalary).average());

    }
}
