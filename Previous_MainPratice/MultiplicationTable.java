import java.util.Scanner;
public class MultiplicationTable {
    static int k =10;
    public  static void result(int a){
       for (int i = 0; i <= k; i++) {

        System.out.println(a*i);
        
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter your Number:- ");
        result(a);
    }
}