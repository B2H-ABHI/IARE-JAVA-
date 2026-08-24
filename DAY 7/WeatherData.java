import java.util.Arrays;

public class WeatherData {
public static void main(String[] args) {

// Temperature data from two weather stations
int[] stationA = {31, 32, 30, 34, 35};
int[] stationB = {31, 32, 30, 34, 35};

// Display arrays

System.out.println("== WEATHER DATA ==");
System.out.println("Station A");
System.out.println(Arrays.toString(stationA));

System.out.println("Station B");
System.out.println(Arrays.toString(stationB));

// Compare the datasets
if (Arrays.equals(stationA, stationB)) {
System.out.println("Both datasets are identical.");
} else {
System.out.println("Both datasets are different.");
}

// Create and initialize default array
int[] defaultArray = new int[5];
Arrays.fill(defaultArray, 25);

System.out.println("Default Array");
System.out.println(Arrays.toString(defaultArray));
}
}
