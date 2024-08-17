import java.util.Scanner;

//import javax.print.event.PrintJobListener;

public class For_Loop {

    public static void main(String[] args) {
        int num;
        System.out.print("Enter your number for your table:- ");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
       //s.close();

        for(int x=1;x<=10;x++)
        {
            System.out.println(num*x + " ");
        }
        //s.close();
    }
}