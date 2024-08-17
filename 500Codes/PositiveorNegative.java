import java.util.Scanner;

/**
 * PositiveorNegative
 */
public class PositiveorNegative {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        if (a>0) {
            System.out.println("The Number is Positive");
            
        }
        else if (a<0) {
            System.out.println("The Number is Negative");
            
        }
        else{
            System.out.println("The Number is Zero.");
        }
    }
}