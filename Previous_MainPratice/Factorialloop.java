import java.util.Scanner;

public class Factorialloop {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number :-");
        int x= sc.nextInt();
        int fact=1;

        for (int i = 1; i <= x; i++) {
            fact=fact*i;

            

            
        }
        System.out.print("Factorial number of " + x + " is :-"+fact);
    }
}
