package homeWork4;

public class Person {
    String name;
    String country;
    int age;

    public Person(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }
    public void printPerson() {
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old");
        System.out.println("I am from "+country);
    }
}
