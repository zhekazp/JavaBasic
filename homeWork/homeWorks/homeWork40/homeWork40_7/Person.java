package homeWorks.homeWork40.homeWork40_7;

public class Person {
    String name;
    String gender;
    int salary;
    int age;

    public Person(String name, String gender, int salary, int age) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
