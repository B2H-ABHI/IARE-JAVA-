import java.util.Scanner;
public class Product {
String productId;
String productName;
double price;
// Default Constructor
Product() {
productId = "P100";
productName = "Laptop";
price = 50000;
}
// Parameterized Constructor
Product(String id, String name, double price) {
productId = id;
productName = name;
this.price = price;
}
// Display method
void display() {
System.out.println("Product ID : " + productId);
System.out.println("Product : " + productName);
System.out.println("Price : ₹" + price);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("==PRODUCT DETAILS ==");
// Default Constructor
Product p1 = new Product();
System.out.println("Using Default Constructor");
p1.display();

// User input
System.out.print("\nEnter Product ID : ");
String id = sc.nextLine();
System.out.print("Enter Product Name : ");
String name = sc.nextLine();
System.out.print("Enter Product Price : ₹");
double price = sc.nextDouble();
// Parameterized Constructor
Product p2 = new Product(id, name, price);
System.out.println("\nUsing Parameterized Constructor");
p2.display();
sc.close();
}
}
