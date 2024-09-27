import java.util.Scanner;

public class Question35 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n + 1]; // Array to store input values (1-based indexing)
        int[] prefixSum = new int[n + 1]; // Prefix sum array (1-based indexing)

        // Input array elements (starting from index 1)
        System.out.println("Enter the elements of the array:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        // Precompute prefix sums
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        // Input number of queries
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        // Answer each query
        for (int i = 0; i < q; i++) {
            System.out.print("Enter l and r for query " + (i + 1) + ": ");
            int l = sc.nextInt(); // Query starting index
            int r = sc.nextInt(); // Query ending index
            int rangeSum = prefixSum[r] - prefixSum[l - 1]; //From the index to index which is put by user
            System.out.println("Sum from index " + l + " to " + r + " is: " + rangeSum);
        }

        sc.close();
    }
}
// public class RangeSumNoQuery {
//     public static void main(String[] args) {
//         // Predefined array (1-based indexing)
//         int[] arr = {0, 1, 2, 3, 4, 5, 6}; // Note: First element is dummy for 1-based indexing
//         int n = arr.length - 1; // Size of the array (ignoring the dummy 0)

//         // Compute the prefix sum in-place (starting from index 1)
//         for (int i = 1; i <= n; i++) {
//             arr[i] += arr[i - 1]; // In-place prefix sum computation
//         }

//         // Predefined range (1-based index) for which you need the sum
//         int l = 2; // Starting index of the range
//         int r = 5; // Ending index of the range

//         // Calculate the sum from index l to r
//         int rangeSum = arr[r] - arr[l - 1]; // In-place range sum calculation
//         System.out.println("Sum from index " + l + " to " + r + " is: " + rangeSum);
//     }
// }


