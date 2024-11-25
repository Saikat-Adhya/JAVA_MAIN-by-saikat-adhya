public class Question13 {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Original Array:");
        printArray(array);
        int[] result = removeEven(array);
        System.out.println("\nArray After Removing Even Numbers:");
        printArray(result);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        // Count the odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Create a new array to store odd numbers
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}
