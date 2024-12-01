import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array length
        System.out.println("Enter the length of the array (n): ");
        int n = sc.nextInt();

        // Input array elements
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Filter the array to ignore negative numbers
        ArrayList<Integer> positiveNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                positiveNumbers.add(arr[i]);
            }
        }
        Collections.sort(positiveNumbers);
        // Check if there are no positive numbers
        if (positiveNumbers.isEmpty()) {
            System.out.println("No valid middle element, all numbers are negative.");
        } else {
            // Find the mid-index (smaller mid index if two mids)
            int size = positiveNumbers.size();
            int midIndex = size / 2; // In case of two mids, this will give the smaller one

            // Print the middle element
            System.out.println("The middle element is: " + positiveNumbers.get(midIndex));
        }

        sc.close();
    }
}
