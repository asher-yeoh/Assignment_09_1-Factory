public class Employee {
    String employeeId;
    String firstName;
    String lastName;
    String dept;
    String position;

    public String fullName() {
        return this.firstName + ' ' + this.lastName;
    }
}