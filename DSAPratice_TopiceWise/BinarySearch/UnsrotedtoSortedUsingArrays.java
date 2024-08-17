import java.util.Arrays;
import java.util.Scanner;

public class UnsrotedtoSortedUsingArrays {

    public static void main(String[] args) {
        int[] arr = {5,1,3,0,2,22,100,30,40,60,20};

        // Sort the array
        Arrays.sort(arr);
        System.out.println("The sorted array is " + Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target number: ");
        int target = sc.nextInt(); // The target Number is :22
        int ans = binarySearch(arr, target);
        System.out.println("The target element: " + target + " Present in index at: " + ans);
    }
    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {     // This is for ascending order array searching
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }
}
