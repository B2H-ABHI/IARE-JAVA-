import java.util.Scanner;
public class WeatherReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read temperature and humidity as String values
        System.out.print("Enter Temperature : ");
        String temperatureText = sc.nextLine();
        System.out.print("Enter Humidity : ");
        String humidityText = sc.nextLine();
        // Convert String values to double
        double temperature = Double.parseDouble(temperatureText);
        double humidity = Double.parseDouble(humidityText);
        // Display weather report
        System.out.println("\n== WEATHER REPORT ==");
        System.out.println("Temperature : " + temperature + " C");
        System.out.println("Humidity    : " + humidity + " %");
        sc.close();
    }
}