import java.util.Arrays;

public class Question9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 6;
        Arrays.sort(arr); // Sorting the array (not strictly necessary here)

        int left = 0; // Use indices
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Found: " + arr[left] + " + " + arr[right] + " = " + target);
                break; // Break the loop after finding a pair
            } else if (sum < target) {
                left++; // Move the left pointer to increase the sum
            } else {
                right--; // Move the right pointer to decrease the sum
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i]+arr[j]==target) {
        //             System.out.println("Target found"+"at"+arr[i]+" "+arr[j]);
        //         }
        //         else{
        //             System.out.println("Target element not present in the array");
        //         }
        //     }
        // }
    }
}
