
import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Consumer Name:");
        String name = sc.nextLine();
        System.out.println("Previous Reading:");
        int previousReading = sc.nextInt();
         System.out.println("Current Reading:");
        int currentReading = sc.nextInt();
        System.out.println("Cost Per Unit:");
        double costPerUnit = sc.nextDouble();
        //Calculate until consumed
        int unitsConsumed = currentReading - previousReading;
        //Calculate Total Bill
        double totalBill = unitsConsumed * costPerUnit;
        //Display formatted bill
        System.out.println("\n** ELECTRICITY BILL**");
        System.out.println("Consumer Name:" + name);
        System.out.println("Units Used:" + unitsConsumed);
        System.out.printf("Cost Per Unit:$%.2f%n", costPerUnit );
        System.out.printf("Total Bill:$%.2f%n", totalBill);
        sc.close();
        




    }
}
