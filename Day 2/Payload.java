import java.util.Scanner;
public class Payload {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //input
        System.out.println("Instrument 1:");
        double instrument1 = sc.nextDouble();
        System.out.println("Instrument 2:");
        double instrument2 = sc.nextDouble();
         System.out.println("Instrument 3:");
        double instrument3 = sc.nextDouble();
        double totalPayLoad = instrument1 + instrument2 + instrument3;
        System.out.println("\n** PAYLOAD REPORT **");
        System.out.printf("Instrument 1: %2f kg%n" , instrument1);
        System.out.printf("Instrument 2: %2f kg%n" ,instrument2);
        System.out.printf("Instrument 3: %2f kg%n" , instrument3);
        System.out.printf("Total PayLoad: %2f kg%n", totalPayLoad);
        sc.close();
        




    }
}


