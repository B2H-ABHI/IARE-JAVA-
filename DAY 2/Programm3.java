import java.util.Scanner;
public class Programm3 {
    public static void main(String[] args) {
         System.out.println("Taking input from the user:");
        Scanner loc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = loc.nextInt();
         System.out.print("Enter another number: ");
        int anotherNumber = loc.nextInt();
        int sum = number + anotherNumber;
        System.out.println("THE SUM IS: " );
        System.out.println(sum);
    }  
    }
    
    