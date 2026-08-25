import java.util.Scanner;
public class StudentReport {
// Method to calculate and return average marks
static double calculateAverage(int mark1, int mark2, int mark3) {
return (mark1 + mark2 + mark3) / 3.0;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Subject 1 : ");
int mark1 = sc.nextInt();
System.out.print("Subject 2 : ");
int mark2 = sc.nextInt();
System.out.print("Subject 3 : ");
int mark3 = sc.nextInt();
// Calling the method and storing the returned value
double average = calculateAverage(mark1, mark2, mark3);
System.out.println("\n== STUDENT REPORT ==");
System.out.println("Average Marks : " + average);
sc.close();
}
}
