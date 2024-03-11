package homeWorks.homeWork36.optional;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HomeWork36_4 {
    public static void main(String[] args) {
        List<Person> persons=new ArrayList<>();
        persons.add(new Person("P1",20));
        persons.add(new Person("P2",30));
        persons.add(new Person("P3",40));
        System.out.println(checkPerson(persons,(p)->p.getAge()<30));
    }
    static public Optional<Person> checkPerson(List<Person> persons, CheckPerson cPerson){
        for(Person person : persons){
            if(cPerson.cPerson(person)){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

static class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
@FunctionalInterface
interface CheckPerson{
    boolean cPerson(Person person);
}
}