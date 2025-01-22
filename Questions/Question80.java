import java.util.Scanner;

public class Question80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int n = sc.nextInt();

        // Convert the decimal number to binary and toggle all bits
        String binaryString = Integer.toBinaryString(n);
        StringBuilder toggledBinary = new StringBuilder();
        
        // Toggle each bit of the binary string
        for (char bit : binaryString.toCharArray()) {
            toggledBinary.append(bit == '0' ? '1' : '0');
        }

        // Convert the toggled binary string back to a decimal number
        int toggledDecimal = Integer.parseInt(toggledBinary.toString(), 2);

        // Output the result
        System.out.println("Result after toggling bits: " + toggledDecimal);
    }     
}
