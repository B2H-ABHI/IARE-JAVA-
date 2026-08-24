//using scanner class, make an array with 3 rows and 3 columns and take input from user and display the array
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //Taking input from user
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //Display the array
        System.out.println("The array is:");
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}