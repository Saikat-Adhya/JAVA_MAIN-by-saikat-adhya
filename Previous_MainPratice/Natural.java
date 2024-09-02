import java.util.Scanner;

public class Natural {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;

        System.out.println("-------------------");
        //int n=4;
        for (int i = 1; i <= n; i++) {
            sum+=i;
            System.out.println(sum);
            System.out.print(i+" ");
        }
    }
    
}
