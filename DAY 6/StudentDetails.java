import java.util.Scanner;
public class StudentDetails{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Read number of students
System.out.print("Enter Number of Students : ");
int n = sc.nextInt();
// Declare single-dimensional array
int[] marks = new int[n];
// Read marks
System.out.println("Enter Marks:");
for (int i = 0; i < n; i++) {
marks[i] = sc.nextInt();
}
// Display marks
System.out.println("\n==STUDENT MARKS ==");
for (int i = 0; i < n; i++) {
System.out.println("Student " + (i + 1) + " : " + marks[i]);
}
sc.close();
}
}