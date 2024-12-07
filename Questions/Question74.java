import java.util.Scanner;

public class Question74 {

    public static int findMissingNumber(int[]nums,int n){
        int total = n*(n+1)/2;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        return total-sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter total number of elements");
        int n = sc.nextInt();
        int[] nums = new int[n-1];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter element at index "+i);
            nums[i] = sc.nextInt();
        }
        System.out.println("The missing number is "+findMissingNumber(nums,n));
    }
}
// alternative
// public int missingNumber(int[] nums) {
//     int total=0;
//     for(int i=1;i<=nums.length;i++){
//         total+=i;
//     }
//     int sum=0;
//     for(int num : nums){
//         sum+=num;
//     }
//     return total-sum;
// }