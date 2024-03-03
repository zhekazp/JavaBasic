package projects.project2.entitys;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

}
