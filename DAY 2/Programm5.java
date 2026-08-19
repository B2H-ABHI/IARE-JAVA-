import java.util.Scanner;

public class    Programm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Accept Product details
        System.out.println("Product Name:");
        String productName = sc.nextLine();
        System.out.println("Quantity:");
        int quantity = sc.nextInt();
        System.out.println("Price:");
        double price = sc.nextDouble();

        //Calculate total amount

        double totalAmount = quantity*price;

        //Display bill

        System.out.println("\n--CUSTOMER BILL--");
        System.out.println("Produc Name :" +productName);
        System.out.println("Quantity :" +quantity);
        System.out.printf("Unit Price: %.2f\n",price);
        System.out.printf("Total Amount:%.2f\n", totalAmount);

        sc.close();

    }
}
