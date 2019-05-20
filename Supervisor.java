public class Supervisor extends Employee {
    
    Supervisor(String employeeId, String firstName, String lastName, String dept) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.position = "Supervisor";
    }
}