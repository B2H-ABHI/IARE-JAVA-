public class TreasureHunter {
    public static void main(String[] args) {

        for (int cave = 1; cave <= 10; cave++) {

            // Skip blocked cave
            if (cave == 3) {
                System.out.println("Cave " + cave + " Blocked. Skipping...");
                continue;
            }

            System.out.println("Searching Cave " + cave + "...");

            // Stop when treasure is found
            if (cave == 4) {
                System.out.println("Treasure Found!");
                break;
            }
        }

        System.out.println("Mission Completed.");

        // Terminate the program
        return;
    }
}
