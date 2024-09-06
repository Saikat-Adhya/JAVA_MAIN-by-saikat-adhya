public class Question11 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans = -1; // Start with -1 (no non-repeated element found)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                ans = arr[i];
            }
        }
        System.out.println(ans);
        
    }
}
