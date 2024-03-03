package projects.project2.services;

import classes.UserInput;
import projects.project2.entitys.Department;

import java.util.ArrayList;

public class UserTalkService {
    UserInput ui= new UserInput();
    public void menu(String[] menus){
        System.out.println("Menu");
        for (int i=0;i<menus.length;i++){
            System.out.println();
            System.out.println((i+1)+": "+menus[i]);
        }
    }
    public void menu(ArrayList<String> menus){
        System.out.println("Menu");
        for (int i=0;i<menus.size();i++){
            System.out.println();
            System.out.println((i+1)+": "+menus.get(i));
        }
    }
    public int answer(int count){
        int i= ui.inputPositiveInt("Enter you choose");
        System.out.println();
        if (i>0 && i<=count){
            return i;
        }else {
            return -1;
        }
    }
    public void error(){
        System.out.println("You entered wrong data, please be careful!");
        System.out.println();
    }
    public String getNewDepartment(){
        return ui.inputText("Enter name of new Department");
    }
    public String[] getNewEmloyee(String companyName){
        String[] employee=new String[4];
        employee[0]=ui.inputText("Enter first name of employee");
        employee[1]=ui.inputText("Enter second name of employee");
        employee[2]=ui.inputText("Enter position of employee");
        employee[3]=companyName;
        return employee;
    }



}
