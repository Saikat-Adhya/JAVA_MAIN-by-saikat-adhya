public class Question10 {
    public static void main(String[] args) {
        int ans =0;
        int [] arr ={1,2,3,4,5,6};
        int target=5;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                   ans++;
                }
            }
        }
        System.out.println(ans);
    }
}