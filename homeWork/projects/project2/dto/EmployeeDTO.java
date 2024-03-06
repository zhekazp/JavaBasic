package projects.project2.dto;

public class EmployeeDTO {
    private String firstName;
    private String lastName;
    private String position;

    public EmployeeDTO(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }
}
