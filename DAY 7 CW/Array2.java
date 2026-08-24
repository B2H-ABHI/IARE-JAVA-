//Create 2 rows and 3 columns array
public class Array2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        //Display the array
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
            System.out.println(arr[0][0]);
            System.out.println(arr[1][2]);
            arr[1][0] = 10;
            System.out.println(arr[1][0]);
            //sum of all elements in the array
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
            }
            System.out.println("Sum of all elements: " + sum);
        }
    }
}