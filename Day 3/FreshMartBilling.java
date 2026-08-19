import java.util.Scanner;
public class FreshMartBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Product Name:");
        String productName = sc.nextLine();
        System.out.println("Quantity:");
        int quantity = sc.nextInt();
         System.out.println("Price:");
        double price = sc.nextDouble();
        //Calculate Total Ampount
        double totalAmount = quantity * price;
        //Output
        System.out.println("\n**SMART BILL**");
        System.out.println("Product Name:"+ productName);
         System.out.println("Quantity:"+ quantity);
         System.out.printf("Umit Price: $%.2f%n", price);
          System.out.printf("Total Amount: $%.2f%n", totalAmount);
          sc.close();


    }
}
