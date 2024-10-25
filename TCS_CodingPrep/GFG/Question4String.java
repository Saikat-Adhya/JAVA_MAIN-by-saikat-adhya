import java.util.Scanner;

public class Question4String {
    public static int factorial(int num){
        int result =1;
        for (int i = 1; i <=num; i++) {
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        String main = s.toLowerCase();
        int count =0;
        for (int i = 0; i < main.length(); i++) {
            char ch = main.charAt(i);
            if (Character.isLetter(ch) &&ch!='a' &&ch!='e' &&ch!='i' &&ch!='o' && ch!='u' ) {
                count++;
            }
        }
        System.out.println("The count of conso: "+count);
        int permu = factorial(count);
        System.out.println("The permu is for the qs : "+permu);
    }
}
