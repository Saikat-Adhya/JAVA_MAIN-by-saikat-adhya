public class Question15 {
    public static int calculateSumAndXor(int[] arr) {
        int evenIndexSum = 0;
        int oddIndexXor = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                // Sum for even indices
                evenIndexSum += arr[i];
            } else {
                // XOR for odd indices
                oddIndexXor ^= arr[i];
            }
        }

        // Return the sum of the two results
        return evenIndexSum + oddIndexXor;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = calculateSumAndXor(arr);
        System.out.println("Sum of the results: " + result);
    }
}
