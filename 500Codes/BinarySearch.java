public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2; // Calculate the middle index
            if (arr[mid] == target) {    // Compare the value at mid to target
                return mid;              // Return the index of the target
            } else if (target < arr[mid]) {
                end = mid - 1;           // Search the left half
            } else {
                start = mid + 1;         // Search the right half
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
