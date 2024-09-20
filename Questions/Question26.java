import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String s = sc.nextLine();
        int a = s.length();
        int base = 1; // base 2^0=1
        int ans = 0;
        
        for (int i = a - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') { // Compare with character '1'
                ans += base;
            }
            base *= 2; // Update base to next positional value
        }
        
        System.out.println("Decimal value: " + ans); // Print the result
    }
}
