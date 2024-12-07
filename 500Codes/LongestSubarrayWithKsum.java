public class LongestSubarrayWithKsum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 3, 2, 4, 10};
        int n = arr.length;
        int left = 0;
        int right = 0;
        int k = 16;
        int sum = arr[0];
        int length = 0;

        while (right < n) {
            // Adjust the left pointer if the sum exceeds k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Check if the current sum equals k
            if (sum == k) {
                length = Math.max(length, right - left + 1);
            }

            // Move the right pointer forward
            right++;
            if (right < n) { // Ensure right is within bounds before accessing the array
                sum += arr[right];
            }
        }

        System.out.println("Length of the longest subarray with sum " + k + ": " + length);
    }
}
