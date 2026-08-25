//create a method with parameters to accept two numbers and display their sum
import java.util.Scanner;
class Addition{
    static void add(int n1 , int n2){
        int sum = n2 + n1;
        System.out.println("Sum="+ sum);
    }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
            int n1 = sc.nextInt();
            System.out.println("Enter second number:");
            int n2 = sc.nextInt();
            add(n1, n2);
            sc.close();


        }
    }
