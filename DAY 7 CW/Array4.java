//Make any random array of 3 rows and 3 columns and display the array... then let user change any element
import java.util.*;
public class Array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //Creating a random array
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = rand.nextInt(100); //Random numbers between 0 and 99
            }
        }

        //Display the array
        System.out.println("The random array is:");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        //Let user change any element
        System.out.println("Enter the row and column of the element you want to change (0-2):");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter the new value:");
        int newValue = sc.nextInt();
        arr[row][col] = newValue;

        //Display the updated array
        System.out.println("The updated array is:");
        for (int[] r : arr) {
            for (int value : r) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
