import java.util.Scanner;

public class StudentMarksMatrix {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Read number of students
System.out.print("Enter Number of Students : ");
int students = sc.nextInt();

// Read number of subjects
System.out.print("Enter Number of Subjects : ");
int subjects = sc.nextInt();

// Declare 2D array
int[][] marks = new int[students][subjects];

// Read marks
for (int i = 0; i <students; i++) {
System.out.print("Student " + (i + 1) + " : ");

for (int j = 0; j < subjects; j++) {
marks[i][j] = sc.nextInt();
}
}

// Display marks matrix
System.out.println("\n==STUDENT MARKS MATRIX ==");

for (int i = 0; i < students; i++) {
System.out.print("Student " + (i + 1) + " : ");

for (int j = 0; j<subjects; j++) {
System.out.print(marks[i][j] + " ");
}

System.out.println();
}

sc.close();
}
}