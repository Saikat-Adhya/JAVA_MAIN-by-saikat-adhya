import java.util.Scanner;

public class Question81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Stirng: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");
        int i=0;
        int j=words.length-1;
        while(i<j){
            String temp =words[i];
            words[i]=words[j];
            words[j]=temp;
            i++;
            j--;
        }
        StringBuilder result = new StringBuilder();
        for (int k = 0; k < words.length; k++) {
            result.append(words[k]);
            if (k < words.length - 1) {
                result.append(" ");
                
            }
        }
        System.out.print("Reversed String: " + result);
    }
}
