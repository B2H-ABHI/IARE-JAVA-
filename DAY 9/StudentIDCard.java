import java.util.Scanner;
public class StudentIDCard {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Accept first name
System.out.print("Enter First Name : ");
String firstName = sc.next();
// Accept last name
System.out.print("Enter Last Name : ");
String lastName = sc.next();
// Concatenate first name and last name
String fullName = firstName + " " + lastName;
// Display student ID card
System.out.println("\n==STUDENT ID CARD ==");
System.out.println("First Name : " + firstName);
System.out.println("Last Name : " + lastName);
System.out.println("Full Name : " + fullName);
sc.close();
}
}
