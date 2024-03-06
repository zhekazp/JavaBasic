package projects.project2.menus;

import projects.project2.services.CompanyService;
import projects.project2.services.Menu;
import projects.project2.services.util.UserTalkService;

import java.util.ArrayList;
import java.util.Arrays;

public class DepartmentsMenu {
    ArrayList<String> maneDepartment =new ArrayList<>(Arrays.asList("Add department","Remove department",
            "Print all departments","Print all employees of department","Exit"));
    Menu depatrmentMenu=new Menu();
    CompanyService companyService;
    public DepartmentsMenu(CompanyService companyService) {
        this.companyService=companyService;
        int userAnswer=0;
        while (userAnswer!=maneDepartment.size()){
            depatrmentMenu.printMenu(maneDepartment);
            userAnswer=depatrmentMenu.getUserChoice(maneDepartment.size());
            manageDepartment(userAnswer);
        }
    }
    public void manageDepartment(int answer){
        switch (answer){
            case -1:
                depatrmentMenu.printError();
                break;
            case 1:
                System.out.println(companyService.addDepartment(UserTalkService.getDepartmentName()));
                 break;
            case 2:
                System.out.println(companyService.removeDepartment(UserTalkService.getDepartmentName()));
                break;
            case 3:
                companyService.printAllDepartments();
                 break;
            case 4:
                System.out.println(companyService.printAllEmployeesOfDepartment(UserTalkService.getDepartmentName()));
                break;

        }
    }
}
