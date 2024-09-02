import java.util.Scanner;

/**
 * OnetoN
 */
public class OnetoN {

    static void PrintDecreaseing(int n){
        if (n==1) {
            System.out.println(n);      //base case
            return;

            
        }
        System.out.println(n);  //self work
        PrintDecreaseing(n-1);  // recursive work
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :-");
        
        int n= sc.nextInt();
        System.out.println("--------------------");

        PrintDecreaseing(n);
        
    }
}