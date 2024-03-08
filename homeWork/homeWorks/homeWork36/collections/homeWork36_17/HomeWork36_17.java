package homeWorks.homeWork36.collections.homeWork36_17;

import homeWorks.homeWork4.Average;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

public class HomeWork36_17 {
    public static void main(String[] args) {
        TreeMap<String, List<Employee>> employees=new TreeMap<>();
        Employee employee1=new Employee("Nick","Department1",2000.0);
        Employee employee2=new Employee("Pit","Department1",2200.0);
        Employee employee3=new Employee("Nina","Department2",3000.0);
        Employee employee4=new Employee("Nicol","Department2",2500.0);
        employees.put("Department1",new ArrayList<Employee>(Arrays.asList(employee1,employee2)));
        employees.put("Department2",new ArrayList<Employee>(Arrays.asList(employee3,employee4)));
        System.out.println("Average salary for Department1 "+ getAverageSalary(employees.get("Department1")));
        System.out.println("Average salary for Department1 "+ getAverageSalary(employees.get("Department2")));


    }
    static double getAverageSalary(List<Employee> employees){
        double sum=0;
        for(Employee employee : employees){
            sum+=employee.getSalary();
        }
        if(!employees.isEmpty()){
            return sum/employees.size();
        }else{
            return 0;
        }
    }
}
