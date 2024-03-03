package projects.project2.entitys;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private Department department;

    public Employee(String firstName, String lastName, String position, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
