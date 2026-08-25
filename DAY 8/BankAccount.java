import java.util.Scanner;
public class BankAccount {
// Method receives a copy of the balance
static void updateBalance(int balance, int bonus) {
balance = balance + bonus;
System.out.println("Balance Inside Method : ₹" + balance);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Initial Balance : ");
int balance = sc.nextInt();
System.out.print("Bonus Amount : ");
int bonus = sc.nextInt();
System.out.println("\n== ACCOUNT REPORT ==");
System.out.println("Balance Before Method : ₹" + balance);
// Calling the method
updateBalance(balance, bonus);
// Original balance remains unchanged
System.out.println("Balance After Method : ₹" + balance);
sc.close();
}
}