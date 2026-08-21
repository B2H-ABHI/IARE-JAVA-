import java.util.Scanner;
public class WalkingChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Days : ");
        int days = sc.nextInt();
        int totalSteps = 0;
        for (int i = 1; i <= days; i++) {
            System.out.print("Day " + i + " Steps : ");
            int steps = sc.nextInt();
            totalSteps = totalSteps + steps;
        }
        System.out.println("\n== FITNESS REPORT ==");
        System.out.println("Total Days : " + days);
        System.out.println("Total Steps Walked : " + totalSteps);
        sc.close();
    }
}