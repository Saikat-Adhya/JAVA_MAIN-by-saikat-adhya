import java.util.Arrays;

public class ArrayDuplicate {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 1, 2, 3,9,6,5,7,4,10,3,2}; // Sample array with duplicates
        int n = a.length;

        // Loop through the array to remove duplicates
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If duplicate found
                if (a[i] == a[j]) {
                    // Shift elements to left to overwrite the duplicate
                    for (int k = j; k < n - 1; k++) {
                        a[k] = a[k + 1];
                    }
                    // Reduce array size
                    n--;
                    // Decrement j to recheck the current position
                    j--;
                }
            }
        }

        // Create a new array to hold the unique elements
        int[] uniqueArray = Arrays.copyOf(a, n);

        // Print the unique elements
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArray));
    }
}
