import java.util.HashSet;

public class NukeSiloCracker {
    public static void main(String[] args) {
        // Sample input
        String input = "2 3\nabc\ndef";
        String[] inputLines = input.split("\n");

        // Extracting N and M
        String[] nm = inputLines[0].split(" ");
        int N = Integer.parseInt(nm[0]); // Number of strings
        int M = Integer.parseInt(nm[1]); // Length of each string

        // Extracting strings
        String[] strings = new String[N];
        for (int i = 0; i < N; i++) {
            strings[i] = inputLines[i + 1];
        }

        // Set to store unique combinations
        HashSet<String> combinations = new HashSet<>();

        // Generating combinations
        generateCombinations(strings, "", combinations, N, M);

        // Printing combinations
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    public static void generateCombinations(String[] strings, String current, HashSet<String> combinations, int N, int M) {
        // Base case: If the current combination length is equal to N, add it to the set
        if (current.length() == N) {
            combinations.add(current);
            return;
        }

        // Recursively generate combinations by appending characters from each string
        for (int i = 0; i < strings.length; i++) {
            for (int j = 0; j < M; j++) {
                String next = current + strings[i].charAt(j);
                generateCombinations(strings, next, combinations, N, M);
            }
        }
    }
}