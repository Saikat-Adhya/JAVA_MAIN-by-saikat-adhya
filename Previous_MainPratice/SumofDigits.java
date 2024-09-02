import java.util.Scanner;

public class SumofDigits {

    static long findsum(long x){
        long sum;
        for ( sum = 0; x>0; sum=sum+x%10,x=x/10); {
            return sum;
            
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        long x = sc.nextLong();
        System.out.println("The answer is "+ findsum(x));
    }
    
}
