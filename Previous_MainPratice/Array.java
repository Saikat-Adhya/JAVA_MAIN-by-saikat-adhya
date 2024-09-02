import java.util.Scanner;

/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int nums[]= new int[size];

        for (int i = 0; i < size; i++) {
            nums[i]=sc.nextInt();
        }
        int x= sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (nums[i]==x) {
                System.out.println("The finding array element is the index: "+i);
                
            }
            else{
                System.out.println("Items not found");
            }
            
        }

    }
}