// Accept the price and quantity of a product, then calculate and display the total bill.
import java.util.Scanner;

public class HW1 {
    void calculateBill() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter product quantity: ");
        int quantity = scanner.nextInt();

        double totalBill = price * quantity;
        System.out.println("Total bill: " + totalBill);
    }

    public static void main(String[] args) {
        HW1 bill = new HW1();
        bill.calculateBill();
    }
}