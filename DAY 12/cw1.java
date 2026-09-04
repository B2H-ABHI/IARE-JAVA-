/*Input: 
Balance: 10000
 Withdrawl Amount : 9000
 Minimun Balance : 2000
 Output :
 Minimum balance requirement not met*/
 public class cw1{
    public static void main(String[] args) {
        double Balance = 10000;
        double withdraw = 7000;
        double minBalance = 2000;
        try {
            
          if (withdraw > Balance ) {
            throw new ArithmeticException("Insufficient Balance");

        }
    
        double remainingBalance = Balance - withdraw;
        if (remainingBalance < minBalance){
            throw new ArithmeticException("Minimum balance requirement not met..");
        }
        System.out.println("Done....");
    }
    catch(ArithmeticException e){
        System.out.println(e.getMessage());
    }
    }
 }