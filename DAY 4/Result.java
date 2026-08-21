import java.util.Scanner;
public class Result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read marks
        System.out.print("Theory Marks : ");
        int theoryMarks = sc.nextInt();
        System.out.print("Practical Marks : ");
        int practicalMarks = sc.nextInt();
        System.out.print("Total Marks : ");
        int totalMarks = sc.nextInt();
        System.out.println("\n== RESULT ==");
        // Nested if statement
        if (theoryMarks >= 35) {
            System.out.println("Theory : PASS");
            if (practicalMarks >= 35) {
                System.out.println("Practical : PASS");
                if (totalMarks >= 150) {
                    System.out.println("Result : DISTINCTION");
                } else {
                    System.out.println("Result : PASS");
                }
            } else {
                System.out.println("Practical : FAIL");
                System.out.println("Result : FAIL");
            }

        } else {
            System.out.println("Theory : FAIL");
            if (practicalMarks >= 35) {
                System.out.println("Practical : PASS");
            } else {
                System.out.println("Practical : FAIL");
            }
            System.out.println("Result : FAIL");
        }
        sc.close();
    }
}