public class Question43 {
    public static void main(String[] args) {
        int[][] arr1 = { {3, -2, 5}, {3, 0, 4} };  // 2x3 matrix
        int[][] arr2 = { {2, 3}, {-9, 0}, {0, 4} }; // 3x2 matrix
        int[][] newarr = new int[arr1.length][arr2[0].length]; // Result will be 2x2

        // Matrix multiplication
        for (int i = 0; i < arr1.length; i++) {         // Row of arr1
            for (int j = 0; j < arr2[0].length; j++) {  // Column of arr2
                for (int k = 0; k < arr1[0].length; k++) { // Iterating over columns of arr1 and rows of arr2
                    newarr[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        // Print the result matrix
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
