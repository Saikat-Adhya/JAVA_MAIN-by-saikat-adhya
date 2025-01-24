import java.util.Scanner;

public class Question83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original string: ");
        String original = sc.nextLine();
        System.out.println("Enter the abberiavte string: ");
        String abbriviate =  sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            char ch = original.charAt(i);
            if (!abbriviate.contains(String.valueOf(ch))) {
                result.append(ch);
            }
        }
        System.out.println("Result Remove String: "+result);
    }
}
