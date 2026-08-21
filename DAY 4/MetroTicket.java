import java.util.Scanner;
public class MetroTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read destination zone number
        System.out.print("Enter Zone Number : ");
        int zone = sc.nextInt();

        System.out.println("\n== METRO TICKET ==");
        // Switch-case statement
        switch (zone) {
            case 1:
                System.out.println("Destination : Central Station");
                System.out.println("Ticket Fare : Rs.20");
                break;
            case 2:
                System.out.println("Destination : City Mall");
                System.out.println("Ticket Fare : Rs.35");
                break;
            case 3:
                System.out.println("Destination : Airport");
                System.out.println("Ticket Fare : Rs.60");
                break;
            case 4:
                System.out.println("Destination : University");
                System.out.println("Ticket Fare : Rs.40");
                break;
            case 5:
                System.out.println("Destination : IT Park");
                System.out.println("Ticket Fare : Rs.50");
                break;
            default:
                System.out.println("Invalid Zone Number.");
        }
        sc.close();
    }
}