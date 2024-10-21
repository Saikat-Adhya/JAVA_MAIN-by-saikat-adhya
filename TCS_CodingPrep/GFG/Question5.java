public class Question5 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7}; // Larger array
        int[] arr2 = {1, 2, 4, 5, 6};       // Potential subset array

        // Check if arr2 is a subset of arr1
        boolean isSubset = isSubset(arr1, arr2);

        if (isSubset) {
            System.out.println("arr2 is a subset of arr1");
        } else {
            System.out.println("arr2 is NOT a subset of arr1");
        }
    }

    // Function to check if arr2 is a subset of arr1
    public static boolean isSubset(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            boolean found = false;
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;  // Element from arr2 is found in arr1
                    break;
                }
            }
            if (!found) {
                return false;  // If any element is not found, arr2 is not a subset
            }
        }
        return true;  // All elements are found, arr2 is a subset
    }
}
