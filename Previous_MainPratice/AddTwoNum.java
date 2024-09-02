import java.util.Scanner;

public class AddTwoNum {
    public static void main(String [] args) {
        int a,b,sum;
        Scanner L = new Scanner(System.in);
        System.out.print("Enter First Number:-");
        a = L.nextInt();

        System.out.print("Enter Second Number:- ");
        b = L.nextInt(); 

        L.close(); 
        sum = a+b;

        System.out.println("Sum of two number:- " + sum);

        
    }
}
