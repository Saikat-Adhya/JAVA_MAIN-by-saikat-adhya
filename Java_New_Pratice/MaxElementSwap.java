public class MaxElementSwap {
    
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 7, 3, 9, 4}; // Example array
        
        System.out.println("Original Array:");
        printArray(arr);
        
        arr = swapMaxWithFirst(arr);
        
        System.out.println("\nArray after swapping max with first:");
        printArray(arr);
    }

    public static int[] swapMaxWithFirst(int arr[]) {
        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return arr;
        }
        
        int maxIndex = 0; // Initialize the index of the maximum element to the first index
        
        // Find the index of the maximum element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; // Update maxIndex if a larger element is found
            }
        }
        
        // Swap the first element with the maximum element
        int temp = arr[0];
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;
        
        return arr; // Return the modified array
    }
    
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
