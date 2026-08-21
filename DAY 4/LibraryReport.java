import java.util.Scanner;
public class LibraryReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read number of delayed days
        System.out.print("Enter Delayed Days : ");
        int delayedDays = sc.nextInt();
        System.out.println("\n== LIBRARY REPORT ==");
        // Check whether fine is applicable
        if (delayedDays > 0) {
            System.out.println("Book Returned After Due Date.");
            System.out.println("Fine Applicable");
        } else {
            System.out.println("Book Returned On Time.");
            System.out.println("No Fine Applicable");
        }
        sc.close();
    }
}
