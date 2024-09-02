import java.util.*;
public class RectangleStarPattern {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter the valueof i: ");
        int r=a.nextInt();
        // System.out.println("Enter the value of j: ");
        // int c=a.nextInt();

        for (int i = r; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }
    
}
