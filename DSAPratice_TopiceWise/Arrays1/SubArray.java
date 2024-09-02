public class SubArray {

    public static int[] Sub(int[] arr, int s, int e) {
        // Initialize the subarray with the correct size
        int[] subarr = new int[e - s + 1];
        
        // Copy the elements from the original array to the subarray
        for (int i = s; i <= e; i++) {
            subarr[i - s] = arr[i];
        }
        
        return subarr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 4};
        int[] res = Sub(arr, 0, 2);
        
        // Print the elements of the resulting subarray
        for (int i : res) {
            System.out.println(i);
        }
    }
}
