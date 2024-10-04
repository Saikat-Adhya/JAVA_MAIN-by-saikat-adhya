import java.util.Scanner;

public class Question45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the range
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        // Initialize a counter for palindrome numbers
        int palindromeCount = 0;

        // Check all numbers in the range
        for (int i = start; i <= end; i++) {
            String numString = Integer.toString(i);
            String reverse = "";

            // Reverse the string representation of the number
            for (int j = 0; j < numString.length(); j++) {
                reverse = numString.charAt(j) + reverse;
            }

            // Check if the original number string is equal to the reversed one
            if (numString.equals(reverse)) {
                palindromeCount++;
            }
        }

        // Output the total count of palindrome numbers
        System.out.println("Total palindrome numbers in the range: " + palindromeCount);

        sc.close();
    }
}
