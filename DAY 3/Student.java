class Student {
    // Static variable
    static String universityName = "ABC Engineering University";
    // Instance variables
    String rollNumber;
    String studentName;
    // Constructor
    Student(String rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }
    // Method containing a local variable
    void displayAdmissionRecord() {
        // Local variable
        String department = "CSE";
        System.out.println("== STUDENT PROFILE ==");
        System.out.println("University   : " + universityName);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("Student Name : " + studentName);
        System.out.println("Department   : " + department);
    }
    public static void main(String[] args) {
        // Creating student object
        Student student = new Student("23ECE101", "Anjali");

        // Display admission record
        student.displayAdmissionRecord();
    }
}