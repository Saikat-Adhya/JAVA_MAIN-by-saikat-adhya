import java.util.Scanner;

public class Question33 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String[]words=s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String storeword= words[i];

            String Captilizeword;
            if (storeword.length()>1) {
                Captilizeword= storeword.substring(0, 1).toUpperCase()+storeword.substring(1, storeword.length()-1).toLowerCase()+storeword.substring(storeword.length()-1).toUpperCase();

            }
            else{
                Captilizeword=storeword.toUpperCase();
            }

            sb.append(Captilizeword);

            if (i<words.length-1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}