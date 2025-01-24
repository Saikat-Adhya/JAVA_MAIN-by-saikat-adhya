public class Question8String {

    public static void reverseWordsInString(String str) {
        String[] words = str.split(" "); // Split the string into words using space as the delimiter
        int i = 0;
        int j = words.length - 1;
        
        // Reverse the order of words
        while (i < j) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
        
        // Join the reversed words back into a single string
        String reversedString = String.join(" ", words);
        System.out.println(reversedString);
    }

    public static void main(String[] args) {
        String str = "this is an amazing program";
        reverseWordsInString(str);
    }
}
//  import java.util.Scanner;

// public class Question1String {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your String: ");
//         String s = sc.nextLine();
        
//         String[] words = s.split(" "); // Split the input string into words
//         String reverse = "";
        
//         // Reverse the words
//         for (int i = words.length - 1; i >= 0; i--) {
//             reverse += words[i];
//             if (i > 0) {
//                 reverse += " "; // Add space between words
//             }
//         }
        
//         System.out.println("Reversed String: " + reverse);
//     }
// }
// 