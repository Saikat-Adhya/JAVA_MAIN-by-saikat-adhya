import java.util.*;

public class Question84 {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store names and scores
        HashMap<String, Integer> candidates = new HashMap<>();

        // Ask the user how many candidates they want to input
        System.out.print("Enter the number of candidates: ");
        int numCandidates = scanner.nextInt();
        scanner.nextLine(); // consume the newline character left by nextInt()

        // Loop to get names and scores from the user
        for (int i = 0; i < numCandidates; i++) {
            System.out.print("Enter the name of candidate " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter the score of " + name + ": ");
            int score = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            // Add the name and score to the HashMap
            candidates.put(name, score);
        }

        // Convert the HashMap to a List of entries for sorting
        List<Map.Entry<String, Integer>> list = new ArrayList<>(candidates.entrySet());

        // Sort the list by scores in descending order
        list.sort((a, b) -> b.getValue() - a.getValue());

        // Print the sorted entries
        System.out.println("\nCandidates sorted by scores:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Close the scanner
        scanner.close();

    }
}
