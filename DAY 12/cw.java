import java.util.Scanner;
public class cw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        String w = "Withdraw:";
    double withdraw = sc.nextDouble();
    try{
        if (withdraw>balance){
            throw new ArithmeticException ("INSUFFICIENT BALANCE");
            
        }
        double remaining = balance - withdraw;
        
        System.out.println("Done" + remaining);
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
   
    }
    
}
