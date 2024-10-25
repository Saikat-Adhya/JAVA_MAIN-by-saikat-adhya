import java.util.Scanner;
public class Question52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vechiles: ");
        int v = sc.nextInt();
        System.out.println("Total Number of wheels: ");
        int w = sc.nextInt();
        if (w>=2 && (w%2==0) && v<w) {

            int fw = (w-2*v)/2;
            int tw = v-fw;
            System.out.println("The total four Wheeler: "+fw);
            System.out.println("The total two Wheeler: "+tw);
        }
        
    }
}