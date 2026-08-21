public class EmployeeDetails {
    // Static variable
    static String companyName = "ABC Technologies";
    // Instance variables
    String employeeId;
    String employeeName;
    // Constructor
    EmployeeDetails(String employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    // Method with local variable
    void displayDetails() {
        // Local variable
        String department = "Software Development";
        System.out.println("== EMPLOYEE DETAILS ==");
        System.out.println("Company Name : " + companyName);
        System.out.println("Employee ID  : " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department   : " + department);
    }
    // Main method
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails("E1025", "Priya Sharma");
        emp.displayDetails();
    }
}

