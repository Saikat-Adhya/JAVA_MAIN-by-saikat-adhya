import java.util.Scanner;

public class Question37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int a= sc.nextInt();
        System.out.println("Enter your second number: ");
        int b = sc.nextInt();
        int hcf=0;
        for (int i = 1; i <=a && i<=b; i++) {
            if (a%i==0 && b%i==0) {
               hcf=i; 
            }
        }
        System.out.println(hcf);
    }
}
