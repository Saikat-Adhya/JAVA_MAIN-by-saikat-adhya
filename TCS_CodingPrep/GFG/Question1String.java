import java.util.Scanner;

public class Question1String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s = sc.nextLine();
        String reverse ="";
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            reverse+=ch;
        }
        if (reverse.equals(s)) {
            System.out.println("This is palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }
    }
}
