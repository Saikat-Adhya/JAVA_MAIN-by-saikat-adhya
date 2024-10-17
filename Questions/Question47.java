import java.util.Scanner;

public class Question47 {
    public static boolean isPerfectNumber(int donation) {
        // Edge case for numbers less than 2 (no perfect numbers below 6)
        if (donation < 2) {
            return false;
        }
        
        int sum = 1; // 1 is a divisor of every number
        
        // Loop to find divisors up to half of the donation amount
        for (int i = 2; i <= donation / 2; i++) {
            if (donation % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum of divisors equals the donation
        return sum == donation;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the donation: ");
        int donation = sc.nextInt();
        if (isPerfectNumber(donation)) {
            System.out.println("True: The donation is a perfect number.");
        } else {
            System.out.println("False: The donation is not a perfect number.");
        }
    }
}
