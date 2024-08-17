import java.util.Scanner;

public class N_Natural_Number {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the first number:- ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        for (int i=1; i<=num; i++) {
            
            System.out.println(i + " ");
        }
    }
}
