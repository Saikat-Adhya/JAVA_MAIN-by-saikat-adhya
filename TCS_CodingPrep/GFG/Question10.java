import java.util.Arrays;

public class Question10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 9, 8, 7};
        int[] arr2 = {5, 6};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergearr = new int[n1 + n2];
        
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Merge arr1 into mergearr
        for (int i = 0; i < n1; i++) {
            mergearr[i] = arr1[i];
        }

        // Corrected the starting index for arr2
        for (int i = 0; i < n2; i++) {
            mergearr[n1 + i] = arr2[i]; // Start inserting from index n1
        }

        // Print the merged array
        for (int i = 0; i < mergearr.length; i++) {
            System.out.print(mergearr[i] + " ");
        }
    }
}
