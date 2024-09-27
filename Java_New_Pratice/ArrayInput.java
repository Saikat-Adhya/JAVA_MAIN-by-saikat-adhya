import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = sc.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter your elements: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
