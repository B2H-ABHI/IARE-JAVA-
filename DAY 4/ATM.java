import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registered PIN : ");
        int registeredPIN = sc.nextInt();
        System.out.print("Enter Entered PIN : ");
        int enteredPIN = sc.nextInt();
        System.out.println("\n== ATM LOGIN ==");
        if (registeredPIN == enteredPIN) {
            System.out.println("PIN Verified Successfully.");
            System.out.println("Welcome to ABC Bank ATM.");
        } else {
            System.out.println("Invalid PIN. Access Denied.");
        }
        sc.close();
    }
}
