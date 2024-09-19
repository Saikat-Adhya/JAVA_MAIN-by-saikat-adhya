import java.util.Scanner;

public class Question24 {
    static void isOdd(int n){
        if ((n & 1)==1) {
            System.out.println("The number is odd");
        }
        else{
            System.out.println("The number is even");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int s=sc.nextInt();
        isOdd(s);
    
    }
}
