import java.util.Scanner;

public class BookTitleReport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input book title
        System.out.print("Enter Book Title : ");
        String title = sc.nextLine();

        // Input keyword
        System.out.print("Enter Keyword : ");
        String keyword = sc.nextLine();

        // Display report
        System.out.println("\n==BOOK TITLE REPORT ==");

        System.out.println("Original Title : " + title);
        System.out.println("Length : " + title.length());
        System.out.println("Uppercase : " + title.toUpperCase());
        System.out.println("Lowercase : " + title.toLowerCase());
        System.out.println("First Character: " + title.charAt(0));
        System.out.println("Keyword Found : " + title.contains(keyword));

        sc.close();
    }
}