package projects.project2.menus;

import projects.project2.services.CompanyService;
import projects.project2.services.Menu;
import projects.project2.services.util.UserTalkService;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeMenu {
    ArrayList<String> maneEmployee =new ArrayList<>(Arrays.asList("Add employee","Remove employee",
            "Print all employees","Transfer an employee to another department","Search employee","Exit"));
    Menu employeeMenu=new Menu();
    CompanyService companyService;

    public EmployeeMenu(CompanyService service) {
        companyService=service;
        int userAnswer = 0;
        while (userAnswer != maneEmployee.size()) {
            employeeMenu.printMenu(maneEmployee);
            userAnswer = employeeMenu.getUserChoice(maneEmployee.size());
            manageEmployee(userAnswer);
        }
    }
    private void manageEmployee(int answer){
        switch (answer) {
            case -1:
                employeeMenu.printError();
                break;
            case 1:
                System.out.println(companyService.addEmployee(UserTalkService.getDepartmentName()));
                break;
            case 2:
                System.out.println(companyService.removeEmployee(UserTalkService.getDepartmentName()));
                break;
            case 3:
                companyService.printAllEmployees();
                break;
            case 4:
                System.out.println(companyService.moveEmployee(UserTalkService.getDepartmentName()));
                break;

            case 5:
                System.out.println(companyService.findEmployee());
                break;
        }
    }
}
