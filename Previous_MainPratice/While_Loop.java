import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any number:-");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while (num>=0) {
            if (num%2==0) {
                System.out.println("The Number is Even...");
                break;
            } else {
                System.out.println("The Number is Odd..");
                break;
            }
            
        }
        System.out.println("The loop is Ended");
    }
}
