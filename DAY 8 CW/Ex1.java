//Accept an integer from user and create a method calulateSquare() to calculate and display the square of given number
import java.util.Scanner;
public class Ex1 {
    static void calulateSquare(int n){
        int square = n * n;
        System.out.println("Square="+ square);
    }
    public static void main(String[] args) {
        Ex1 a =  new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        a.calulateSquare(n);
        sc.close();
        
    }
    
}
