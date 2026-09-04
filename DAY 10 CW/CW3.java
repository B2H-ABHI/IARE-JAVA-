//accept username and password from user and compare them with anyhing of yours, if correct show Login Successful...
import java.util.Scanner;
public class CW3 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Input username:");
    String username = sc.nextLine();
     System.out.println("Input password:");
    String pass = sc.nextLine();
        if (username.equals("Abhinav")  && pass.equals("12345")){
            System.out.println("Login Successful");
        }
           else{

            System.out.println("Invalid credentials");

        }
            sc.close();

         }
    

    }
    

