import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int a,b,c;
        System.out.print("Enter a number:- ");
        Scanner sc = new Scanner(System.in);

        a=sc.nextInt();
        b=1;
        c=0;
        
        while(b<= a) 
                       { 
                           if((a%b)==0) 
                              c=c+1; 
                              b++; 
                       } 
                        if(c==2) 
                        System.out.println(a +" is a prime number"); 
                        else 
                        System.out.println(a +" is not a prime number"); 
    }
}
