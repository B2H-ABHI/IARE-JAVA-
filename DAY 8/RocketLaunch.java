import java.util.Scanner;
public class RocketLaunch {
// Recursive method for countdown
static void countDown(int number) {
if (number == 0) {
System.out.println("Rocket Launched Successfully!");
return;
}
System.out.println(number);
countDown(number - 1);
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter Countdown Value : ");
int number = sc.nextInt();
System.out.println("\n== COUNTDOWN ==");
// Calling the recursive method
countDown(number);
sc.close();
}
}