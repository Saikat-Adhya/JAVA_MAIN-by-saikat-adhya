import java.util.Scanner;

public class ReverseWordsInString {

    public static void Reverse(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i > 0) { // Add space between words, except after the last word
                result += " ";
            }
        }
        System.out.println();
        System.out.println("Reversed String: " + result); // Print the reversed string
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        Reverse(s); // Call the Reverse method
    }
}
