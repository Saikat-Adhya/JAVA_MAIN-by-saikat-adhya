public class Second_Largest_element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6, 7};
        
        // Sort the array in ascending order
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        // After sorting, the second largest element is the second last element in the array
        int secondLargest = arr[arr.length - 2];
        System.out.println("The second largest element is: " + secondLargest);
    }
}
