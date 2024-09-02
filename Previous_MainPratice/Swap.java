import java.util.Scanner;
public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,temp;
        System.out.println("Enter The First number: ");
        a = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        b= sc.nextInt();

        temp=a;
        a=b;
        b=temp;
        System.out.println("The revrse numbers is: ");
        System.out.println("The number is "+a);
        System.out.println("The number is "+b);
        
    }
    
    
}
