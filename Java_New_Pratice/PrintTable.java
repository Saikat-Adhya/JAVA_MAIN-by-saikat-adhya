import java.util.Scanner;

public class PrintTable {
    

    public static void result(int b){
        int sum=10;
        int total=0;
        for (int i = 1; i <=sum; i++) {

            int s=i*b;
            System.out.println("The table of"+" " +b+"*"+i+ "="+s);
            total+=s;
            
        }
        System.out.println("The total is:-----------");
        System.out.println(total);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=sc.nextInt();
        result(a);
    }
    
}