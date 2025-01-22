public class Question78 {
    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 6, 4, 5, 0, 7, 0, 8, 9,0 };
        int left = 0; int right = 0;

        while (left < arr.length && right < arr.length) {
            if (arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
            right++;


            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
