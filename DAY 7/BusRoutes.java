import java.util.Scanner;

public class BusRoutes {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Read number of routes
System.out.print("Enter Number of Routes : ");
int routes = sc.nextInt();

// Declare jagged array
int[][] busStops = new int[routes][];

// Read stops for each route
for (int i = 0; i<routes; i++) {
System.out.print("Route " + (i + 1) + " Stops : ");
int stops = sc.nextInt();

// Create each row with different size
busStops[i] = new int[stops];

// Read stop numbers
for (int j = 0; j<stops; j++){
busStops[i][j] = sc.nextInt();

}
}

// Display bus routes
System.out.println("\n==BUS ROUTES =");

for (int i = 0; i<routes; i++) {
System.out.print("Route " + (i + 1) + ": ");

for (int j = 0; j<busStops[i].length; j++) {
System.out.print(busStops[i][j] + " ");
}

System.out.println();
}
sc.close();

}
}