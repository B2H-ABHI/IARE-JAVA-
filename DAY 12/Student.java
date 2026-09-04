import java.util.Scanner;

public class Student {

    private String rollNumber;
    private String name;
    private int marks;

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void displayStudentInfo() {
        System.out.println("== STUDENT DETAILS ==");
        System.out.println("Roll Number : " + getRollNumber());
        System.out.println("Name : " + getName());
        System.out.println("Marks : " + getMarks());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter Roll Number : ");
        student.setRollNumber(sc.nextLine());

        System.out.print("Enter Name : ");
        student.setName(sc.nextLine());

        System.out.print("Enter Marks : ");
        student.setMarks(sc.nextInt());

        System.out.println();

        student.displayStudentInfo();

        sc.close();
    }
}

