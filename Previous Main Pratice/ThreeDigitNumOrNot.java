//import java.util.*;
import java.util.Scanner;

public class ThreeDigitNumOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        
        if (a>99 && a<=999) {
            System.out.println("The Number is Three Digit.");
            
        } else {
            System.out.println("The Given number is not a three Digit.");
        }
        //System.out.println(a);


        
    }
    
    
}
