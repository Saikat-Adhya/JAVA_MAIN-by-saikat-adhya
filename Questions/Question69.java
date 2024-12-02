import java.util.Scanner;

public class Question69 {
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
        char[] ch = ans.toCharArray();
        for(int i=0;i<ch.length;i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        System.out.print("The total number of digits are: "+ch.length);
    }
}
