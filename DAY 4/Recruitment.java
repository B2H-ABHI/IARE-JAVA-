import java.util.Scanner;
public class Recruitment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read CGPA
        System.out.print("Enter CGPA : ");
        double cgpa = sc.nextDouble();
        System.out.println("\n== RECRUITMENT REPORT ==");
        System.out.println("CGPA : " + cgpa);
        // if-else-if ladder
        if (cgpa >= 9.0 && cgpa <= 10.0) {
            System.out.println("Performance Category : Excellent");
        } 
        else if (cgpa >= 8.0) {
            System.out.println("Performance Category : Very Good");
        } 
        else if (cgpa >= 7.0) {
            System.out.println("Performance Category : Good");
        } 
        else if (cgpa >= 6.0) {
            System.out.println("Performance Category : Average");
        } 
        else {
            System.out.println("Performance Category : Needs Improvement");
        }
        sc.close();
    }
}
