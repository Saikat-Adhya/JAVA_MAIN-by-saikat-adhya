import java.util.Scanner;

public class Question59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.println("Enter your number: ");
        String number = sc.nextLine();

        // Calculate the sum of digits
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            sum += ch - '0'; // Convert char digit to int and add to sum
        }

        // Check if the sum of digits is prime
        boolean isPrime = true;
        if (sum <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            for (int i = 2; i <= sum/2; ++i) {
                if (sum % i == 0) {
                    isPrime = false; // Not prime if divisible by i
                    break;
                }
            }
        }

        // Print the result
        if (isPrime) {
            System.out.println(number + " is a Googly Prime Number.");
        } else {
            System.out.println(number + " is NOT a Googly Prime Number.");
        }

        sc.close();
    }
}
