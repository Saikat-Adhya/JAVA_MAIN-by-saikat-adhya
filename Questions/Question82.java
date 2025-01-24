import java.util.Scanner;

public class Question82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // Select filter type
        System.out.println("Choose a filter type: ");
        System.out.println("a - Alphabets");
        System.out.println("d - Digits");
        System.out.println("s - Spaces");
        System.out.println("p - Punctuation/Special Characters");
        char filterType = sc.next().charAt(0);

        // Result string to store filtered characters
        StringBuilder result = new StringBuilder();

        // Iterate through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Filter based on the selected type
            if (filterType == 'a' && Character.isAlphabetic(ch)) { // Alphabets
                result.append(ch);
            } else if (filterType == 'd' && Character.isDigit(ch)) { // Digits
                result.append(ch);
            } else if (filterType == 's' && Character.isWhitespace(ch)) { // Spaces
                result.append(ch);
            } else if (filterType == 'p' && !Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) { // Punctuation/Special Characters
                result.append(ch);
            }
        }

        // Display the result
        System.out.println("Filtered result: " + result);
    }
}
