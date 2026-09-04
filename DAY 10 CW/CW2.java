import java.util.Scanner;
public class CW2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = sc.nextLine();
        if (username.equals("admin")){
            //HERE, IF WE USED :- if(username==admin);  THERE WOULD HAVE BEEN AN ERROR.....
            System.out.println("VALID USERNAME");
        }else {
            System.out.println("Invalid username");

        }
            sc.close();

        }
    }
    

