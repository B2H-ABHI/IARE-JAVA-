import java.util.Scanner;

public class FreshMartInventory {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Read number of grocery items
System.out.print("Enter Number of Items :");
int n = sc.nextInt();

// Declare single-dimensional array
int[] quantity = new int[n];

int total = 0;

// Read item quantities
System.out.println("Item Quantities");
for (int i = 0; i < n; i++) {
quantity[i] = sc.nextInt();
total = total + quantity[i];
}

// Display inventory report

System.out.println("\n==INVENTORY REPORT ==");

for (int i = 0; i < n; i++) {
System.out.println("Item " + (i + 1) + " : " + quantity[i]);
}

System.out.println("Total Stock Available : " + total);

sc.close();
}
}
