public class JustTry {
    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 7};
        System.out.print("Original Array:");
        changes(arr);
        System.out.println("-------------------------------------");
        max(arr);
        System.out.print("After swapping the array:");
        changes(arr);

    }

    // First Check Max element and then Swap it

    static void max(int[] arr) {
        int maxIndex = 0; // Initialize the index of the maximum element to the first index

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i; // Update maxIndex if a larger element is found
            }
        }

        int temp = arr[0]; // Swap the first element with the maximum element
        arr[0] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    // for printing the updated array

    public static void changes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }
}
