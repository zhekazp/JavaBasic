package homeWorks.homeWork21.homeWork21_6.entitys;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("The name of employee is : "+name);
        System.out.println("age : "+age);
        System.out.println("salary : "+salary);
        System.out.println("==================================");
    }
}
