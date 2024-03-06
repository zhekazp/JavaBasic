package projects.project2.services;

import projects.project2.dto.EmployeeDTO;
import projects.project2.dto.error.ErrorDto;

import java.util.ArrayList;
import java.util.List;

public class EmployeeValidation {
    public List<ErrorDto> checkEmployee(EmployeeDTO employee,String command){
        List<ErrorDto> errorList=new ArrayList<>();
        if(employee.getFirstName().length() < 3 || employee.getFirstName().length() > 15){
            errorList.add(new ErrorDto(3,command+" The firstname of employee "+
                    "must have minimum 4 and maximum 15 letters"));
        }
        if(employee.getLastName().length() < 3 || employee.getFirstName().length() > 20){
            errorList.add(new ErrorDto(3,command+" The lastname of employee "+
                    "must have minimum 4 and maximum 20 letters"));
        }
        if(employee.getPosition().length() < 3 || employee.getFirstName().length() > 30){
            errorList.add(new ErrorDto(3,command+" The firstname of employee "+
                    "must have minimum 4 and maximum 30 letters"));
        }
        return  errorList;
    }
}
