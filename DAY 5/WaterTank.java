import java.util.Scanner;

public class WaterTank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tank Capacity : ");
        int capacity = sc.nextInt();

        int waterStored = 0;

        while (waterStored < capacity) {
            System.out.print("Water Added : ");
            int waterAdded = sc.nextInt();

            waterStored = waterStored + waterAdded;
        }

        // Prevent stored water from exceeding tank capacity
        if (waterStored > capacity) {
            System.out.println("Tank Overflow! Water Added Exceeds Capacity.");
            
        }
        else {
            System.out.println("Tank Filled Successfully.");
        
        }
        System.out.println("\n== TANK STATUS ==");
        System.out.println("Tank Capacity : " + capacity + " Litres");
        System.out.println("Water Stored : " + waterStored + " Litres");
        System.out.println("Tank Filled Successfully");
        
        sc.close();
    }
}

