import java.util.Scanner;

public class Question42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Your Number: ");
        int n = sc.nextInt();
        int result =0;
        int original_num= n;
        int numberOfDigits=String.valueOf(n).length();

        for (int tmp = n; tmp!=0; tmp/=10) {
            int digit = tmp%10;
            result+=Math.pow(digit, numberOfDigits);
        }
        if (result==original_num) {
            System.out.println("This is a armstrong Number.");
        }
        else{
            System.out.println("This is not a armstrong number.");
        }
    }
}
