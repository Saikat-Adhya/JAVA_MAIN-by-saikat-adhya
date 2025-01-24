import java.util.Scanner;

public class SumofOddAndEven {

    public static void main(String[] args) {
        int odd=0;
        int even=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your numbers:");
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                even+=arr[i];   
            }
            else{
                odd+=arr[i];
            }
        }
        int z= odd+even;
        System.out.println("The sum of odd and even number is:"+ z);
    }
}