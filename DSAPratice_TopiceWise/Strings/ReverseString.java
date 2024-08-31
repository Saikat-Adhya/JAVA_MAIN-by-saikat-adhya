import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String : -");
        String s =sc.nextLine();
        String reverse = "";

        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i)+reverse;
        }
        System.out.print(reverse);
        
    }
}
