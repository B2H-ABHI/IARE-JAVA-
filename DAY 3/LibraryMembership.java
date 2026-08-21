import java.util.Scanner;
public class LibraryMembership {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Member ID: ");
            String memberID = scanner.nextLine();
            System.out.print("Enter your membership type (Regular/Premium): ");
            String membershipType = scanner.next();
             // Convert String values into wrapper objects
            Integer memberId = Integer.valueOf(memberID);
            // Displaying the entered details
            System.out.println("\n== LIBRARY MEMBERSHIP DETAILS ==");
            System.out.println("Name            : " + name);
            System.out.println("Member ID       : " + memberId);
            System.out.println("Membership Type : " + membershipType);
        }
    }
    
}
