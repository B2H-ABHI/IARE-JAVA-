import java.util.Scanner;
import java.util.StringTokenizer;
public class GroceryItems {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Item 1 : ");
String item1 = sc.nextLine();
System.out.print("Enter Item 2 : ");
String item2 = sc.nextLine();
System.out.print("Enter Item 3 : ");
String item3 = sc.nextLine();
System.out.print("Enter Item 4  ");
String item4 = sc.nextLine();
// Combine the four items
String items = item1 + "," + item2 + "," + item3 + "," + item4;
// Separate items using StringTokenizer
StringTokenizer st = new StringTokenizer(items, ",");
System.out.println("\n==PURCHASED ITEMS ==");

int count = 1;
while (st.hasMoreTokens()) {
System.out.println("Item " + count + " : " + st.nextToken().trim());
count++;
}
sc.close();
}
}