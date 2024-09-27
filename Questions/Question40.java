public class Question40 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 6, 4, 5, 1, 7, 1, 8, 9, 1 };
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 1) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println();
        for (int i = index; i < arr.length; i++) {
            arr[i] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
