package homeWorks.homeWork21.homeWork21_6.entitys;

public class Manager extends Employee {

    Employee[] employees;
    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void saveEmployees(Employee[] employees){
        this.employees=new Employee[employees.length];
        for (int i=0;i<employees.length;i++){
            this.employees[i]=employees[i];
        }
    }
    public void printEmployees(){
        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}
