import java.util.Scanner;

public class Question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter your decimal number: ");
        int a = sc.nextInt();
        String ans="";
        while (a>0) {
            int reminder=a%2;
            ans+=reminder;
            a=a/2;
        }
        System.out.println(ans);
    }
}
