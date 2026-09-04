public class Department {
// Department details
String departmentName;
// Constructor for Department
Department(String departmentName) {
this.departmentName = departmentName;
}
// Inner class
class Faculty {
String facultyName;
String designation;
// Constructor for Faculty
Faculty(String facultyName, String designation) {
this.facultyName = facultyName;
this.designation = designation;
}
// Display faculty details
void displayFaculty() {
System.out.println("Faculty Name : " + facultyName);
System.out.println("Designation : " + designation);
}
}
// Main method
public static void main(String[] args) {
// Create Department object
Department dept = new Department(
"Electronics and Communication Engineering"
);
// Create Faculty object using Department object
Department.Faculty faculty =

dept.new Faculty("ABHINAV KASHYAP", "Student");
System.out.println("== DEPARTMENT DIRECTORY ==");
System.out.println("Department Name : " + dept.departmentName);
faculty.displayFaculty();
}
}