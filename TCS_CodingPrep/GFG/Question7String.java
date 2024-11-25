import java.util.Scanner;

public class Question7String {

    public static void removeVowels(String s){
        String result = "";
        int count = 0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);

            if (ch !='a' && ch!='e'&& ch!='i'&& ch!='o'&& ch!='u') {
                result+=ch;
                count++;
            }
        }
        System.out.println(result+" + "+" without vowels");
        System.out.println(count+" Total vowels");
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your strig");
        String s = sc.nextLine();
        removeVowels(s);
        
    }
}
