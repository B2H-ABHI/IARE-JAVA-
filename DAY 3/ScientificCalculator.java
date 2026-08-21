import java.util.Scanner;
public class ScientificCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        //READ NUMBERS AS STRING VALUES
        System.out.print("Enter First Number: ");
        String firstNumber = scanner.nextLine();
        System.out.print("Enter Second Number: ");
        String secondNumber = scanner.nextLine();
        // Convert String to integer using Integer.parseInt()
         int num1 = Integer.parseInt(firstNumber);
        int num2 = Integer.parseInt(secondNumber);
          // Calculate sum
        int sum = num1 + num2;
        // Display calculation report
        System.out.println("\n== CALCULATION REPORT ==");
        System.out.println("First Number  : " + num1);
        System.out.println("Second Number : " + num2);
        System.out.println("Sum           : " + sum);
        }
    }
    
}
