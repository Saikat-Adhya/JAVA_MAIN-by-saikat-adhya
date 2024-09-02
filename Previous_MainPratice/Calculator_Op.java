import java.util.Scanner;

public class Calculator_Op {
    public static void main(String[] args) {
        int a,b,c,d;
        System.out.println("Enter any two number:-");
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        System.out.println("Enter your Choice as you wish:- ");
        d= s.nextInt();


        switch (d) {
            case 1:c=a+b;
            System.out.println("Addition " +c);
                break;

            case 2:c=a-b;
            System.out.println("Subtraction " +c);
                break;

            case 3:c=a*b;
            System.out.println("Multipication " +c);
                break;

            case 4:c=a/b;
            System.out.println("Division " +c);
                break;

            case 5:c=a%b;
            System.out.println("Remainder " +c);
                break;
        
            default: 
            System.out.println("Invalid Choice!!");
                break;
        }

    }
}
