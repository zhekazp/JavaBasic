package projects.project2.entitys;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Company {
    private TreeMap<String, Department> departmens=new TreeMap<>();
    int employeeQuantity=0;

    public Company() {
        departmens.put("department1",new Department("department1"));
        departmens.put("department2",new Department("department2"));
        departmens.put("department3",new Department("department3"));
        departmens.get("department1").getEmployees().add(new Employee("Name1",
                "Test2","programmer",departmens.get("department1")));
        departmens.get("department1").getEmployees().add(new Employee("Name2",
                "Test2","creator",departmens.get("department1")));
        departmens.get("department3").getEmployees().add(new Employee("Name3",
                "Test3","tester",departmens.get("department3")));
        departmens.get("department2").getEmployees().add(new Employee("Name3",
                "Test4","programmer",departmens.get("department2")));
    }

    public void addDepartment(String name){
        if(departmens.containsKey(name)){
            System.out.println("Error. Adding is impossible. The department with name - "+name+ " is already exist.");
            System.out.println();
        }else{
            Department department=new Department(name);
            departmens.put(name,department);
            System.out.println("The department with name - "+name+ " added.");
            System.out.println();
        }
    }
    public void removeDepartment(String name){
        Department department=departmens.get(name);
        if(department == null){
            System.out.println("Error. Removing is impossible. The department with name - "+name+ " is not exist.");
            System.out.println();
        }else{
            departmens.remove(name);
            System.out.println("The department with name - "+name+ " removed.");
            System.out.println();
        }
    }
    public Department searchDepartment(String name){
        Department department=departmens.get(name);
        if(department == null){
            System.out.println("The department with name - "+name+ " is not exist.");
            System.out.println();
         }
        return department;
    }
    public void addEmployee(String [] employeeDate){
        employeeQuantity++;
        Department department=departmens.get(employeeDate[3]);
        Employee employee=new Employee(employeeDate[0],employeeDate[1],employeeDate[2],
                department);
        department.getEmployees().add(employee);
        System.out.println("The employee added");
        System.out.println();
    }
    public void removeEmployee(String department, int index){
        departmens.get(department).getEmployees().remove(index);
        employeeQuantity--;
    }
    public void printAllDepartments(){
        if (departmens.size()>0){
            System.out.println("The company has departments:");
            for(String key:departmens.keySet()){
                System.out.println(key);
            }
        }else{
            System.out.println("The company has no departments:");

        }
    }
    public void printAllEmployees(){
        System.out.println("Company has "+employeeQuantity+" employees");
        for (Map.Entry entry :departmens.entrySet()){
            for (Employee employee:((Department) entry.getValue()).getEmployees()){
                System.out.println(entry.getKey().toString()+" : "+employee);
            }
        }
    }
    public void searchEmployee(String [] employeeDate){
        System.out.println("Company has employees with this parameters:");
        System.out.println("Name: "+employeeDate[0]+" SerName: "+employeeDate[1]+
                " position: "+employeeDate[2]);
        boolean isResults=false;
        for (Map.Entry entry :departmens.entrySet()){
            for (Employee employee:((Department) entry.getValue()).getEmployees()){
                boolean print= !employeeDate[0].isEmpty() && employeeDate[0].equals(employee.getFirstName());
                if(!employeeDate[1].isEmpty()){
                    print= employeeDate[1].equals(employee.getLastName());
                }
                if(!employeeDate[2].isEmpty()){
                    print= employeeDate[2].equals(employee.getPosition());
                }
                if(print) {
                    System.out.println(entry.getKey().toString() + " : " + employee);
                    isResults=true;
                }
            }
        }
        if(!isResults){
            System.out.println("Search has no results");
        }
    }
    public  void printAllEmployeeOfDepartment(String name){
        ArrayList<Employee> employees=departmens.get(name).getEmployees();
        if(employees.size()==0){
            System.out.println("Department "+name+" has no employee");
        }else{
            System.out.println("Department has employees:");
            for (Employee employee:employees){
                System.out.println(employee);
            }
        }
    }
    public void moveEmployee(String departmentFrom, String departmentTo, int index){
        Department tempDepartment=departmens.get(departmentFrom);
        departmens.get(departmentTo).getEmployees().add(tempDepartment.getEmployees().get(index));
        tempDepartment.getEmployees().remove(index);
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
    public int countApartments(){
        return departmens.size();
    }

}
