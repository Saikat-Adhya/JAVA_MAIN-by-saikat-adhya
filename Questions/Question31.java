import java.util.Arrays;

public class Question31 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 }; // Example array
        int elementToRemove = 3; // Element to remove

        // Create a new array with one less element
        int[] result = new int[arr.length - 1];
        int index = 0;

        // Loop through the original array
        for (int i = 0; i < arr.length; i++) {
            // If the current element is not the one to be removed, add it to the result
            // array
            if (arr[i] != elementToRemove) {
                result[index] = arr[i];
                index++;
            }
        }

        // Output the result
        System.out.println("Array after removing element " + elementToRemove + ": " + Arrays.toString(result));
    }
}
