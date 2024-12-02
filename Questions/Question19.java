public class Question19 {
    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    
    static void sort(int[] arr) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            if (arr[s] == 1 && arr[e] == 0) {
                swap(arr, s, e);
                s++;
                e--;
            } else {
                if (arr[s] == 0) {
                    s++;
                }
                if (arr[e] == 1) {
                    e--;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 0};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
