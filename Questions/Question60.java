import java.util.Scanner;

public class Question60 {   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter your number: ");
        // int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <4; i++) {
            System.out.println("Enter your numbers:");
            int num = sc.nextInt();
            if (num < 0) {
                sum+=num;
                
            }
        }
        sc.close();
        System.out.println("Sum of the numbers is: " + sum);
    }
}
