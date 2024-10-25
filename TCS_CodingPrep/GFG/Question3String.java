import java.util.Scanner;

public class Question3String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = sc.nextLine();
        String newstr ="";
        String[]words = s.split("\\s");
        for (int i = 0; i < words.length; i++) {
            String storeword = words[i];
            if (storeword.length()>1) {
                newstr+=storeword.substring(0, 1).toUpperCase()+storeword.substring(1, storeword.length()-1)+storeword.substring(storeword.length()-1).toUpperCase()+" ";
            }

        }
        System.out.println(newstr);
    }
}
