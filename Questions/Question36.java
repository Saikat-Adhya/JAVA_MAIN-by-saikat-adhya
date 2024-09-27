import java.util.Scanner;

public class Question36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter your number: ");
        int num = sc.nextInt();
    
        // 0 and 1 are not prime numbers
        if (num == 0 || num == 1) {
            System.out.println(num+ "Not a prime number");
            return;
        }
    
        for (int i = 2; i <= num / 2; ++i) {
    
          // condition for nonprime number
          if (num % i == 0) {
            System.out.println(num+ "Not a prime number");
            return;
          }
        }
        System.out.println(num + " is a prime number.");
      }
}