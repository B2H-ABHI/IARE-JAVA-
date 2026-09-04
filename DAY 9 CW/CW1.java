import java.util.Scanner;
class CW1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();
        
        System.out.println("Enter name:");
        sc.nextLine(); // Consume the leftover newline after nextInt().
        String name = sc.nextLine();
        System.out.println("Age:"+ age);
        System.out.println("Name:"+ name);
        sc.close();

    }
}