import java.util.Scanner;
public class RestaurantBill {
// Method to calculate and display the bill
static void calculateBill(int item1, int item2, int item3) {
int totalBill = item1 + item2 + item3;
System.out.println("\n== RESTAURANT BILL ==");
System.out.println("Item 1 : " + item1);
System.out.println("Item 2 : " + item2);
System.out.println("Item 3 : " + item3);
System.out.println("Total Bill : ₹" + totalBill);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Price of Item 1 : ");
int item1 = sc.nextInt();
System.out.print("Enter Price of Item 2 : ");
int item2 = sc.nextInt();
System.out.print("Enter Price of Item 3 : ");
int item3 = sc.nextInt();
// Calling the calculateBill() method
calculateBill(item1, item2, item3);
sc.close();
}
}