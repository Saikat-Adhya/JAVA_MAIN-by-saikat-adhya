public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
        
        // Call the method to remove duplicates and get the new length
        int newLength = removeduplicate(arr);
        
        // Print only the unique elements
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeduplicate(int[] arr) {
        // Pointer j for the position of the last unique element found
        int j = 0;

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) { // Start from 1 because arr[0] is always unique
            if (arr[j] != arr[i]) { // Compare with the last unique element
                arr[++j] = arr[i]; // Increment j and update the next position
            }
        }
        
        return j + 1; // The length of the array with unique elements
    }
}
