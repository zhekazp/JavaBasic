package projects.project2.services.util;
import projects.project2.dto.EmployeeDTO;
import projects.project2.entitys.Employee;
import projects.project2.services.util.UserInput;

import java.util.ArrayList;

public class UserTalkService {

    public static String getDepartmentName(){
        return UserInput.inputText("Enter name of Department");
    }
    public static EmployeeDTO getEmployeeParameters(){
        String name=UserInput.inputText("Enter first name of employee");
        String lastname=UserInput.inputText("Enter second name of employee");
        String position=UserInput.inputText("Enter position of employee");
        return new EmployeeDTO(name,lastname,position);
    }



}
