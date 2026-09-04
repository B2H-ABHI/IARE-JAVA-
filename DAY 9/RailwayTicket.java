public class RailwayTicket {
public static void main(String[] args) {
// Create ticket details using StringBuffer
StringBuffer ticket = new StringBuffer("Passenger: Priya");
System.out.println("==RAILWAY TICKET ==");
System.out.println("Original Ticket " + ticket);
// Append the old coach number
ticket.append(" Coach: B1");
// Replace old coach number B1 with updated coach number B2
int start = ticket.indexOf("B1");
ticket.replace(start, start + 2, "B2");
// Display updated ticket
System.out.println("Updated Ticket " + ticket);

}
}