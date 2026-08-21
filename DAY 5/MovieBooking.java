import java.util.Scanner;

public class MovieBooking {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int totalCustomers = 0;
            int totalTickets = 0;
            char continueBooking;

            do {
                System.out.print("Customer Name : ");
                String customerName = sc.nextLine().trim();
                while (customerName.isEmpty()) {
                    System.out.print("Customer Name cannot be empty. Enter again: ");
                    customerName = sc.nextLine().trim();
                }

                System.out.print("Tickets : ");
                int tickets;
                while (true) {
                    if (sc.hasNextInt()) {
                        tickets = sc.nextInt();
                        if (tickets > 0) {
                            break;
                        }
                    } else {
                        sc.next();
                    }
                    System.out.print("Enter a positive number of tickets: ");
                }
                sc.nextLine();

                totalCustomers++;
                totalTickets = totalTickets + tickets;
                System.out.println("Booking confirmed for " + customerName);

                do {
                    System.out.print("Continue (Y/N) : ");
                    String response = sc.nextLine().trim();
                    continueBooking = response.isEmpty() ? ' ' : response.charAt(0);
                } while (continueBooking != 'Y' && continueBooking != 'y'
                        && continueBooking != 'N' && continueBooking != 'n');

            } while (continueBooking == 'Y' || continueBooking == 'y');

            System.out.println("\n== BOOKING SUMMARY ==");
            System.out.println("Total Customers : " + totalCustomers);
            System.out.println("Total Tickets : " + totalTickets);
            System.out.println("Thank You for Booking");
        }

    }
}
