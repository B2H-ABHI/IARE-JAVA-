import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.println("NAME:");
        String name = sc.nextLine();
        System.out.println("WEIGHT:");
        double weight = sc.nextDouble();
        System.out.println("HEIGHT:");
        double height = sc.nextDouble();
        //Calculate BMI
        double bmi = (weight) / (height * height);
        //Display details
        System.out.println("\n**BMI REPORT:**");
        System.out.println("NAME:"+name);
        System.out.println("Weight:" + weight + "kg");
        System.out.println("Height:" + height +"m");
        System.out.printf("BMI:%.2f%n", bmi);

        sc.close();
    }
}