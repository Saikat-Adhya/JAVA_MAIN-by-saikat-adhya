import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();
        System.out.println("Enter the third number: ");
        int o = sc.nextInt();
        sc.close();
        if (n>m && n>o) {
            System.out.println(n + " is the largest number.");
        } else if (m>n && m>o) {
            System.out.println(m + " is the largest number.");
        } else {
            System.out.println(o + " is the largest number.");
            
        }
    }
}