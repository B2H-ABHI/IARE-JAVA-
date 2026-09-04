import java.util.Scanner;
class Account {
int accountNumber;
String accountHolder;
// Parent class constructor
Account(int accountNumber, String accountHolder) {
this.accountNumber = accountNumber;
this.accountHolder = accountHolder;
}
// Parent class method
void displayAccount() {
System.out.println("Account Number : " + accountNumber);
System.out.println("Account Holder : " + accountHolder);
}
}
class SavingsAccount extends Account {
double interestRate;
// Child class constructor
SavingsAccount(int accountNumber, String accountHolder, double interestRate) {
super(accountNumber, accountHolder); // Calls parent constructor
this.interestRate = interestRate;
}
void displayDetails() {
System.out.println("==ACCOUNT DETAILS ==");

super.displayAccount(); // Calls parent method
System.out.println("Interest Rate : " + interestRate + "%");
}
}
public class BankAccount {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Account Number : ");
int accountNumber = sc.nextInt();
sc.nextLine(); // Consume newline
System.out.print("Enter Account Holder Name : ");
String accountHolder = sc.nextLine();
System.out.print("Enter Interest Rate : ");
double interestRate = sc.nextDouble();
SavingsAccount account =
new SavingsAccount(accountNumber, accountHolder, interestRate);
System.out.println();
account.displayDetails();
sc.close();
}
}