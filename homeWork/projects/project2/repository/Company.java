package projects.project2.repository;


import projects.project2.dto.EmployeeDTO;
import projects.project2.entitys.Department;
import projects.project2.entitys.Employee;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Company {
    private TreeMap<String, Department> departmens=new TreeMap<>();
    int employeeQuantity=0;

    public Company() {
        departmens.put("dep1",new Department("department1"));
        departmens.put("department2",new Department("department2"));
        departmens.put("department3",new Department("department3"));
        departmens.get("dep1").getEmployees().add(new Employee("Name1",
                "Test2","programmer",departmens.get("dep1")));
        departmens.get("dep1").getEmployees().add(new Employee("Name2",
                "Test2","creator",departmens.get("dep1")));
        departmens.get("department3").getEmployees().add(new Employee("Name3",
                "Test3","tester",departmens.get("department3")));
        departmens.get("department2").getEmployees().add(new Employee("Name3",
                "Test4","programmer",departmens.get("department2")));
    }

    public void addDepartment(String name){
            Department department=new Department(name);
            departmens.put(name,department);
    }

    public void removeDepartment(String name){
        Department department=departmens.get(name);
        departmens.remove(name);
    }
    public Department searchDepartment(String name){
        return departmens.get(name);
    }
    public void addEmployee(EmployeeDTO employeeDTO, String name){
        employeeQuantity++;
        Department department=departmens.get(name);
        Employee employee=new Employee(employeeDTO.getFirstName(),employeeDTO.getLastName(),employeeDTO.getPosition(),
                department);
        department.getEmployees().add(employee);
    }
    public void removeEmployee(Department department, int index){
        department.getEmployees().remove(index);
        employeeQuantity--;
    }


    public ArrayList<String> searchEmployee(EmployeeDTO employeeDTO){
        ArrayList<String> employees=new ArrayList<>();
        for (Department entry :departmens.values()){
            searchEmployeeInDepartment(employees,employeeDTO,entry,false);
        }
        return employees;
    }
    public ArrayList<Integer> searchEmployeeInDepartment(ArrayList<String> list,EmployeeDTO employeeDTO, Department department, boolean withId){
        int index=0;
        ArrayList<Integer> ids=new ArrayList<>();
        for (Employee employee: department.getEmployees()){
            boolean print= !employeeDTO.getFirstName().isEmpty() &&
                    employee.getFirstName().contains(employeeDTO.getFirstName());
            if(!employeeDTO.getLastName().isEmpty()){
                print= employee.getLastName().contains(employeeDTO.getLastName());
            }
            if(!employeeDTO.getPosition().isEmpty()){
                print= employee.getPosition().contains(employeeDTO.getPosition());
            }
            if(print) {
                String temp="";
                if(withId){
                    temp="id- "+index+" ";
                }
                list.add(temp+department.getName() + " : " + employee);
                ids.add(index);
            }
            index++;
        }
        return ids;
    }

    public void moveEmployee(Department department, String departmentTo, int index){
        departmens.get(departmentTo).getEmployees().add(department.getEmployees().get(index));
        department.getEmployees().remove(index);
    }
    public ArrayList<String> returnAllEmployeeOfDepartment(String name){
        ArrayList<String> result=new ArrayList<>();
        for(Employee employee:departmens.get(name).getEmployees()){
            result.add(employee.toString());
        }
        return result;
    }
    public String[] getDepartmentsAsArray(){
        String[] departmentstemp=new String[departmens.size()+1];
        int i=0;
        for(String key : departmens.keySet()){
            departmentstemp[i]=key;
            i++;
        }
        return departmentstemp;
    }
    public int countDepartments(){
        return departmens.size();
    }
    public boolean checkKeyExist(String key){
        return departmens.containsKey(key);
    }
    public Department getDepartment(String key){
        return departmens.get(key);
    }
    public TreeMap<String, Department> printDepartments(){
        return departmens;
    }
    public int getEmployeeQuantity(){
        return employeeQuantity;
    }


}
