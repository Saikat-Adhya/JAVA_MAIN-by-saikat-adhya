import java.util.Scanner;
public class ok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++) {
                System.out.println(i+" "+j);
                
            }
            //System.out.println(i+" ");
            

        }
        System.out.print("Enter a number which you want to covert: ");
        int number = sc.nextInt();
        
        String strNumber = Integer.toString(number);
        System.out.println("Converted string: " + strNumber);

    }
}
