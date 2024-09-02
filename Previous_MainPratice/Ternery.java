import java.util.Scanner;

public class Ternery {
    public static void main(String[] args) {
        int a,b,c;
        //System.out.println("Enter your number:-");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Number:-");
        a=sc.nextInt();
        System.out.println("Enter Your Second Number");
        b=sc.nextInt();
        System.out.println("Enter Your Third Number:-");
        c=sc.nextInt();
        
       int r= (a>b)?(a>c?a:c):(b>c?b:c);
       System.out.println("The Greatest number is:-" + r);
    }
}
