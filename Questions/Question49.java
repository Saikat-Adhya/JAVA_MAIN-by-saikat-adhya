public class Question49 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6}; // Given array
        int k = 5; // Target sum
        int cnt = 0; // To count the subarrays with sum == k

        // Outer loop to pick the starting point of subarray
        for (int i = 0; i < arr.length; i++) {
            int sum = 0; // Initialize sum for each new subarray

            // Inner loop to explore subarrays starting from index i
            for (int j = i; j < arr.length; j++) {
                sum += arr[j]; // Add element to the current subarray's sum
                
                // If the sum of the current subarray equals k, increment count
                if (sum == k) {
                    cnt++; // Increment the count
                    System.out.print("Subarray with sum " + k + ": ");
                    for (int x = i; x <= j; x++) {
                        System.out.print(arr[x] + " ");
                    }
                    System.out.println(); // New line after printing the subarray
                }
            }
        }
        // Print the final count of subarrays after both loops finish
        System.out.println("The total subarray count of the given sum is: " + cnt);
    }
}
