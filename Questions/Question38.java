import java.util.Scanner;

public class Question38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number or string: ");
        String n= sc.nextLine();
        String reverse="";
        for (int i = 0; i < n.length(); i++) {
            reverse=n.charAt(i)+reverse;
        }
        if (n.equals(reverse)) {
            System.out.println("this is a palindrome string");
        }
        else{
            System.out.println("This is not a palindrome string");
        }
    }
}
