public class Question3 {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        // Traverse the array and check for equilibrium index
        int equilibriumIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            // Right sum is totalSum - leftSum - arr[i]
            if (leftSum == totalSum - leftSum - arr[i]) {
                equilibriumIndex = i;  // Equilibrium index found
                break;
            }
            // Update left sum for the next iteration
            leftSum += arr[i];
        }

        // Output the result
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index is at position: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found");
        }
    }
}
