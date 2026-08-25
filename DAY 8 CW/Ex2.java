//Accept marks o f 3 subjects and create a method calculateTotal() to display the total marks
import java.util.Scanner;
public class Ex2 {
    static void calculateTotal(int subject1, int subject2, int subject3) {
        int total = subject1 + subject2 + subject3;
        System.out.println("Total marks = " + total);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
            System.out.println("Enter marks for subject 1:");
            int subject1 = sc.nextInt();

            System.out.println("Enter marks for subject 2:");
            int subject2 = sc.nextInt();

            System.out.println("Enter marks for subject 3:");
            int subject3 = sc.nextInt();

            calculateTotal(subject1, subject2, subject3);
        }
    }

