/*program to accept two integers from  user and create three methods:
findMaximum()
findMinimum()
displayResult()
*/
import java.util.Scanner;
public class HW2{
    static int findMaximum(int a, int b) {
        return a > b ? a : b;
    }

    static int findMinimum(int a, int b) {
        return a < b ? a : b;
    }

    static void displayResult(int maximum, int minimum) {
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first integer: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second integer: ");
            int secondNumber = scanner.nextInt();

            int maximum = findMaximum(firstNumber, secondNumber);
            int minimum = findMinimum(firstNumber, secondNumber);
            displayResult(maximum, minimum);
        }
    }
}
