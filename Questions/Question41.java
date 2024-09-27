import java.util.Scanner;

public class Question41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n= sc.nextInt();
        int[]arr= new int[n];
        System.out.println("Enter the digits: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int mistakes=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==arr[0]) {
                mistakes++;
            }
        }
        System.out.println(n-mistakes);
    }
}
