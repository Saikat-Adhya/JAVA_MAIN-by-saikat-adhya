import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        int pwd;
        System.out.println("Enter Your Password:- ");
        Scanner obj = new Scanner(System.in);
        pwd = obj.nextInt();
        if (pwd == 2731)
        {
            System.out.println("My name is: - Saikat Adhya");
            System.out.println("My address is: - khagra ");

        }
        else
        {
            System.out.println("you entered wrong password");
        }
    }
}
