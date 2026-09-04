import java.util.Scanner;

public class BoardingPass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input passenger names
        System.out.print("Passenger Name : ");
        String passengerName = sc.nextLine();

        System.out.print("Another Name : ");
        String anotherName = sc.nextLine();

        // Input ticket number
        System.out.print("Ticket Number : ");
        String ticketNumber = sc.nextLine();

        // Remove leading and trailing spaces
        String trimmedName = passengerName.trim();

        // Extract destination code from AI-DEL-2045
        String destinationCode = ticketNumber.substring(3, 6);

        // Display boarding pass
        System.out.println("\n==BOARDING PASS ==");
        System.out.println("Trimmed Name : " + trimmedName);
        System.out.println("Names Equal : " + trimmedName.equals(anotherName.trim()));
        System.out.println("Destination Code : " + destinationCode);
        System.out.println("Starts with \"AI\" : " + ticketNumber.startsWith("AI"));

        sc.close();
    }
}
