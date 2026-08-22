import java.util.Scanner;

public class CricketScoreUpdate {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

// Read number of players
System.out.print("Enter Number of Players : ");
int n = sc.nextInt();

// Declare single-dimensional array
int[] runs = new int[n];

// Read runs scored by each player
System.out.println("Runs");
for (int i = 0; i < n; i++) {
runs[i] = sc.nextInt();
}

// Read player number to update
System.out.print("Update Player Number : ");
int playerNumber = sc.nextInt();

// Read revised score
System.out.print("New Score : ");
int newScore = sc.nextInt();

// Update the player's score
runs[playerNumber - 1] = newScore;

// Display updated scoreboard
System.out.println("\n==UPDATED SCOREBOARD ==");

for (int i = 0; i < n; i++) {
System.out.println("Player " + (i + 1) + " : " + runs[i]);
}

sc.close();
}
}


