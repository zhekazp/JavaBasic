package projects.project2.services;

import projects.project2.dto.error.ErrorDto;

import java.util.ArrayList;
import java.util.List;

public class Validation {
    public List<ErrorDto> checkCompanyName(String command, String name, Boolean IsNameExist){
        List<ErrorDto> errorList=new ArrayList<>();
        if(IsNameExist){
            errorList.add(new ErrorDto(0,command+" The department with name - "
                    +name+ " is already exist."));
        }
        if(name.length()<4 || name.length()>20){
            errorList.add(new ErrorDto(1,command+" The department name must have minimum 4" +
                    " and maximum 20 letters"));
        }
        return  errorList;
    }
    public List<ErrorDto> checkCompanyExisting(String command, String name, Boolean IsNameExist){
        List<ErrorDto> errorList=new ArrayList<>();
        if(name.length()<4 || name.length()>20){
            errorList.add(new ErrorDto(1,command+" The department name must have minimum 4" +
                    " and maximum 20 letters"));
        }else{
            if(!IsNameExist){
                errorList.add(new ErrorDto(3,command+" The department with name - "
                        +name+ " is not exist."));
            }
        }
        return  errorList;
    }

}
