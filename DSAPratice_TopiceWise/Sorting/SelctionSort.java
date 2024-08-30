public class SelctionSort {
    static void Selctionsort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;

                }
            }
            int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 0 };
        Selctionsort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
