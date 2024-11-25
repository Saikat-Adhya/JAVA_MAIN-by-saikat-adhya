import java.util.Arrays;
import java.util.Scanner;

public class Question6String {

    public static void anagram(String s1 , String s2){
        boolean status = true;
        if (s1.length()!=s2.length()) {
            
          System.out.println("This not anagram");
        }
        else{
            char []ch1 = s1.toLowerCase().toCharArray();
            char []ch2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            status =  Arrays.equals(ch1, ch2);
        }
        if (status) {
            System.out.println(s1+" and "+s2+" Is anagram ");
        }
        else{
            System.out.println(s1+" and "+s2+" Is not anagram ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the first string: ");
        String s1 =  sc.nextLine();
        System.out.print("ENter the second string: ");
        String s2 =  sc.nextLine();

        anagram(s1, s2);

    }
}
