package projects.project2.dto;

import projects.project2.dto.error.ErrorDto;

import java.util.List;

public class ClientResponse {
    String response;
    List<ErrorDto> errors;

    public ClientResponse(String response, List<ErrorDto> errors) {
        this.response = response;
        this.errors = errors;
    }

    @Override
    public String toString() {
        String result="ClientResponse{";
        if(!errors.isEmpty()){
            result +="errors=" + errors;
        }else{
            result +="response=" + response;
        }
        result+='}';
        return result;
    }
}
