public class Question71 {
    public static void Prefixsum(int[] arr) {
        int n = arr.length;
        int[] prefixsum = new int[n];
        prefixsum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixsum[i] = prefixsum[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(prefixsum[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 16, 20};
        Prefixsum(arr);
    }
}
