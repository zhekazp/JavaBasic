package projects.project2.menus;


import projects.project2.services.CompanyService;
import projects.project2.services.Menu;

import java.util.ArrayList;
import java.util.Arrays;

public class MainMenu {

    ArrayList <String> maneMenu =new ArrayList<>(Arrays.asList("Operations with departments",
            "Operations with employees","Exit"));

    Menu menu=new Menu();
    CompanyService mainService=new CompanyService();
    public MainMenu() {
        int userAnswer=0;
        while (userAnswer!=maneMenu.size()){
            menu.printMenu(maneMenu);
            userAnswer=menu.getUserChoice(maneMenu.size());
            manageMain(userAnswer);
        }
    }
    private void manageMain(int answer){
        switch (answer){
            case -1:
                menu.printError();
                break;
            case 1:
                DepartmentsMenu department=new DepartmentsMenu(mainService);
                break;
            case 2:
                EmployeeMenu employee=new EmployeeMenu(mainService);
                break;
        }
    }

}
