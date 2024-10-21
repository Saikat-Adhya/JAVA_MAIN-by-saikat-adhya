import java.util.Scanner;

public class Question51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the range for the Fibonacci series
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();
        
        // Variables to store the first two Fibonacci numbers
        int a = 0, b = 1;

        // Print Fibonacci numbers in the given range
        System.out.println("Fibonacci series in the range [" + start + ", " + end + "]:");

        // Using a for loop to generate Fibonacci numbers in the range
        for (int i = 0; a <= end; i++) {
            // Only print Fibonacci numbers within the specified range
            if (a >= start) {
                System.out.print(a + " ");
            }

            // Move to the next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        sc.close(); // Close the scanner
    }
}
