package homeWorks.homeWork40.homeWork40_5;

import java.util.*;
import java.util.stream.Collectors;

public class HomeWork40_5 {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("Person1",30, Arrays.asList("HTML","JS")));
        persons.add(new Person("Person2",20, Arrays.asList("Pascal","JS")));
        persons.add(new Person("Person3",25, Arrays.asList("HTML","Java")));
        persons.add(new Person("Person4",40, Arrays.asList("HTML","JS","PHP")));

        List<String> skills=persons.stream().filter(person -> person.getAge()>25).
                flatMap(person -> person.getSkills().stream()).distinct().toList();

        System.out.println(skills);
    }
    static class Person{
        String name;
        int age;
        List<String> skills;

        public Person(String name, int age, List<String> skills) {
            this.name = name;
            this.age = age;
            this.skills = skills;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public List<String> getSkills() {
            return skills;
        }
    }
}
