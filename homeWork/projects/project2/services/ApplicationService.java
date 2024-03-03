package projects.project2.services;


import projects.project2.entitys.Company;
import projects.project2.entitys.Employee;

import java.util.ArrayList;

public class ApplicationService {
    private String[] maneMenu={"Operations with departments","Operations with employees","Exit"};
    private String[] maneDepartsment={"Add department","Remove department","Print all departments","Print all employees of department","Exit"};
    private String[] maneEmployee={"Add employee","Remove employee","Print all employees","Transfer an employee to another department","Search employee","Exit"};
    UserTalkService talk=new UserTalkService();
    Company company=new Company();
    public ApplicationService() {
        int menu=0;
        while (menu!=maneMenu.length){
            talk.menu(maneMenu);
            menu=talk.answer(maneMenu.length);
            manageMain(menu);
        }
    }
    private void manageMain(int exercise){
        switch (exercise){
            case -1:
                talk.error();
                break;
            case 1:
                int menu=0;
                while (menu!=maneDepartsment.length){
                    talk.menu(maneDepartsment);
                    menu=talk.answer(maneDepartsment.length);
                    manageDepartment(menu);
                }
               break;
            case 2:
                menu=0;
                while (menu!=maneEmployee.length) {
                    talk.menu(maneEmployee);
                    menu = talk.answer(maneEmployee.length);
                    manageEmployee(menu);

                }
                break;
        }
    }
    private void manageEmployee(int exercise){
        switch (exercise){
            case -1:
                talk.error();
                break;
            case 1:
                System.out.println("Choose department in which you want to add an employee:");
                String chose=choseDepartment();
                if (!chose.isEmpty()) {
                    company.addEmployee(talk.getNewEmloyee(chose));
                }
                break;
            case 2:
                System.out.println("Choose department in which you want to remove an employee:");
                chose=choseDepartment();
                if (!chose.isEmpty()) {
                    int employeeIndex=choseEmployeeToRemove(chose);
                    if(employeeIndex !=-1){
                           company.removeEmployee(chose,employeeIndex);
                    }
                }
                break;
            case 3:
                company.printAllEmployees();
                break;
            case 4:
                if(company.countApartments()<2){
                    System.out.println("You have not enough departments to move employees");
                }else {
                    System.out.println("Choose department from which you want to move an employee:");
                    chose = choseDepartment();

                    System.out.println("Choose department in which you want to move an employee:");
                    String chose2 = choseDepartment();
                    if(!chose2.isEmpty() && !chose.isEmpty()){
                        if(chose2.equals(chose)){
                            System.out.println("You can not transfer employee in same department");
                        }else{
                            int employeeIndex=choseEmployeeToRemove(chose);
                            if(employeeIndex !=-1){
                                company.moveEmployee(chose,chose2,employeeIndex);
                            }

                        }
                    }
                }
                break;
            case 5:
                System.out.println("Enter search parameters");
                System.out.println("If you don`t want to use one of the parameters just put Enter");
                company.searchEmployee(talk.getNewEmloyee(""));
                break;
        }
    }
    private int choseEmployeeToRemove(String chose){
        int employeeIndex=-1;
        ArrayList<String> employees=company.returnAllEmployeeOfDepartment(chose);
        if(employees.isEmpty()){
            System.out.println("Department "+chose+" has no employee");
        }else {
            System.out.println("Choose employee who you want to remove:");
            employeeIndex = choseEmployee(employees);
        }
        return employeeIndex;
    }
    private void manageDepartment(int exercise){
        switch (exercise){
            case -1:
                talk.error();
                break;
            case 1:
                company.addDepartment(talk.getNewDepartment());
                break;
            case 2:
                System.out.println("Choose department which you want to remove:");
                        String chose=choseDepartment();
                        if (!chose.isEmpty()) {
                            company.removeDepartment(chose);
                        }
                        break;
            case 3:
                company.printAllDepartments();
                break;
            case 4:
                System.out.println("Choose department to print its all employee:");
                chose=choseDepartment();
                if (!chose.isEmpty()) {
                    company.printAllEmployeeOfDepartment(chose);
                }
                break;

        }

    }
    private String choseDepartment(){
        int menu=0;
        String res="";
        String[] dep=company.getDepartmentsAsArray();
        dep[dep.length-1]="Exit";
        while (menu!=dep.length){
            talk.menu(dep);
            menu=talk.answer(dep.length);
            if(menu==-1){
                talk.error();
            }else {
                if (menu != dep.length) {
                    res=dep[menu-1];
                    menu = dep.length;
                }
            }
        }
        return res;
    }
    private int choseEmployee(ArrayList<String> employees){
        int menu=0;
        int res=-1;
        employees.add("Exit");
        while (menu!=employees.size()){
            talk.menu(employees);
            menu=talk.answer(employees.size());
            if(menu==-1){
                talk.error();
            }else {
                if (menu != employees.size()) {
                   res=menu-1;
                   menu=employees.size();
                }
            }
        }
        return res;
    }

}
