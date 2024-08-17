public class Searching {
    public static void main(String[] args) {
        int arr[] = {6, 7, 8, 9, 1, 0};
        int target = 9;
        int result = hello(arr, target);
        if (result == -1) {
            System.out.println("Item not found");
        } else {
            System.out.println("Item found at index: " + result);
        }
    }

    static int hello(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
