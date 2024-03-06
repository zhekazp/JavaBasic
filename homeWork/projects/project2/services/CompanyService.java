package projects.project2.services;

import projects.project2.dto.ClientResponse;
import projects.project2.dto.EmployeeDTO;
import projects.project2.dto.error.ErrorDto;
import projects.project2.entitys.Department;
import projects.project2.entitys.Employee;
import projects.project2.repository.Company;
import projects.project2.services.util.UserInput;
import projects.project2.services.util.UserTalkService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompanyService {
    Company company=new Company();
    Validation validation=new Validation();
    EmployeeValidation employeeValidation=new EmployeeValidation();
    public ClientResponse addDepartment(String name){
       List<ErrorDto> errorList=validation.checkCompanyName("Adding is impossible.",name,company.checkKeyExist(name));
        String response="";
        if (errorList.isEmpty())
        {
            company.addDepartment(name);
            response="The department with name - "+name+ " added.";
        }
        return new ClientResponse(response,errorList);
    }
    public ClientResponse removeDepartment(String name){
        List<ErrorDto> errorList=validation.checkCompanyExisting("Removing is impossible.",name,
                company.checkKeyExist(name));
        String response="";

        if(errorList.isEmpty()){
            response="The department with name - "+name+ " removed.";
            company.removeDepartment(name);
        }
        return new ClientResponse(response,errorList);
    }
    public void printAllDepartments(){
        if (company.countDepartments()>0){
            System.out.println("The company has departments:");
            for(String key:company.printDepartments().keySet()){
                System.out.println(key);
            }
        }else{
            System.out.println("The company has no departments:");
        }
    }
    public ClientResponse printAllEmployeesOfDepartment(String name){
        List<ErrorDto> errorList=validation.checkCompanyExisting("Printing employee is impossible.",name
                ,company.checkKeyExist(name));
        String response="";
        if(errorList.isEmpty()){
            ArrayList<String> employees=company.returnAllEmployeeOfDepartment(name);
            if(employees.isEmpty()){
                System.out.println("Department "+name+" has no employee");
            }else {
                for (String employee : employees){
                    System.out.println(employee);
                }
                response = "Status-ok";
            }
        }
        return new ClientResponse(response,errorList);
    }
    public ClientResponse addEmployee(String name){
        List<ErrorDto> errorList=validation.checkCompanyExisting("Adding is impossible.",name
                ,company.checkKeyExist(name));
        String response="";
        if(errorList.isEmpty()) {
            EmployeeDTO employee = UserTalkService.getEmployeeParameters();
            errorList = employeeValidation.checkEmployee(employee, "Adding is impossible.");
            if(errorList.isEmpty()){
                company.addEmployee(employee,name);
                response ="The employee added";
            }
        }
        return new ClientResponse(response,errorList);
    }
    public void printAllEmployees(){
        System.out.println("Company has "+company.getEmployeeQuantity()+" employees");
        for (Map.Entry<String,Department> entry :company.printDepartments().entrySet()){
            for (Employee employee:(entry.getValue()).getEmployees()){
                System.out.println(entry.getKey()+" : "+employee);
            }
        }
    }
    public ClientResponse findEmployee(){
        String response="";
        List<ErrorDto> errorList=new ArrayList<>();
        System.out.println("Enter search parameters");
        System.out.println("If you don`t want to use one of the parameters just put Enter");
        EmployeeDTO employee = UserTalkService.getEmployeeParameters();
        if(employee.getPosition().isEmpty() && employee.getLastName().isEmpty() &&
                employee.getFirstName().isEmpty()){
            errorList.add(new ErrorDto(4," All parameters are empty."));
        }else {
            response="Status='ok'";
            ArrayList<String> list=company.searchEmployee(employee);
            for(String e: list){
                System.out.println(e);
            }
        }
        return new ClientResponse(response,errorList);
    }
    public ClientResponse moveEmployee(String name){
        List<ErrorDto> errorList=new ArrayList<>();
        Department department=company.getDepartment(name);
        errorList=validation.checkCompanyExisting("Removing is impossible.",name,
                company.checkKeyExist(name));
        String response = "";
        if(errorList.isEmpty()) {
            int id = removeE(department, errorList);
            if (errorList.isEmpty()) {
                System.out.println("In which department do you want to move employee?");
                String newDepartment=UserTalkService.getDepartmentName();
                errorList=validation.checkCompanyExisting("Removing is impossible.",newDepartment,
                        company.checkKeyExist(newDepartment));
                if (errorList.isEmpty()) {
                    company.moveEmployee(department,newDepartment, id);
                    response = "Employee " + name + " removed.";
                }
            }
        }


        return new ClientResponse(response,errorList);
    }
    public ClientResponse removeEmployee(String name){
        List<ErrorDto> errorList=new ArrayList<>();
        Department department=company.getDepartment(name);
        errorList=validation.checkCompanyExisting("Removing is impossible.",name,
                company.checkKeyExist(name));
        String response = "";
        if(errorList.isEmpty()) {
            int id = removeE(department, errorList);
            if (errorList.isEmpty()) {
                company.removeEmployee(department, id);
                response = "Employee "+name+" removed.";
            }
        }


        return new ClientResponse(response,errorList);
    }
    private int removeE(Department department,List <ErrorDto> errorList){
        int id=-1;
            System.out.println("Enter search parameters");
            System.out.println("If you don`t want to use one of the parameters just put Enter");
            EmployeeDTO employee = UserTalkService.getEmployeeParameters();
            if(employee.getPosition().isEmpty() && employee.getLastName().isEmpty() &&
                    employee.getFirstName().isEmpty()){
                errorList.add(new ErrorDto(4," All parameters are empty."));
            }else {
                ArrayList<String> employees = new ArrayList<>();
                ArrayList<Integer> ids = company.searchEmployeeInDepartment(employees, employee, department,true);
                System.out.println("Department " + department.getName() + " has next employees:");
                System.out.println(employees);
                System.out.println();
                id=UserInput.inputIntPos("Enter id of employee who you want to remove.");
                if(id < 0 || !ids.contains(id)){
                    errorList.add(new ErrorDto(5,"Employee can`t be removed. You entered wrong id"));
                }
            }

        return id;
    }
}
