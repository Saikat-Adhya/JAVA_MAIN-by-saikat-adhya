public class Question17 {
    // Function to rotate the array
    public static void rotate(int[] a, int k) {
        int n = a.length;
        k = k % n; // Handle the case when k is greater than the array length
        reverse(a, 0, n - 1);       // Step 1: Reverse the entire array
        reverse(a, 0, k - 1);       // Step 2: Reverse the first k elements
        reverse(a, k, n - 1);       // Step 3: Reverse the rest of the elements
    }

    // Function to reverse the elements of the array from index start to end
    private static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    // Test the rotation
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Number of steps to rotate
        rotate(a, k);

        // Print the rotated array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}