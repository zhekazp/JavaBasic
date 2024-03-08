package homeWorks.homeWork36.collections.homeWork36_11;

import java.util.LinkedHashSet;

public class HomeWork36_11 {
    public static void main(String[] args) {
        LinkedHashSet<Person> persons=new LinkedHashSet<>();
        persons.add(new Person("Nick",40));
        persons.add(new Person("Tom",20));
        persons.add(new Person("Bill",15));
        System.out.println(persons);
        for(Person person:persons){
            if(person.getAge()<30){
                System.out.println(person);
            }
        }

    }
}
