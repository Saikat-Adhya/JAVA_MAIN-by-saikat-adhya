import java.util.Scanner;

public class Powerrecursion {
    public static int Power(int p, int q){
        if (q==0) {
            return 1;
            
        } else {

            return(Power(p, q-1)*p);
            
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the base :");
        int p = sc.nextInt();
        System.out.print("Enter the power: ");
        int q= sc.nextInt();
        System.out.println("The power of "+p+" to the power "+q+"is "+Power(p,q));
    }
    
}