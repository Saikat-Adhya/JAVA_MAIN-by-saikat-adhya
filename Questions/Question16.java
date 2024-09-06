public class Question16 {

    public static int[] Rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // This handles cases where k > n
        int[] ans = new int[n];
        int j = 0;
        
        // Copy the last 'k' elements to the start of 'ans'
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        
        // Copy the remaining elements to 'ans'
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Original array
        int[] ans = Rotate(arr, 10000); // Rotate array by 2 steps
        
        // Print the rotated array
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " "); // Use 'ans' to print the rotated array
        }
    }
}
