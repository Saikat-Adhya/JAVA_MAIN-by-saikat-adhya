public class Question66 {

    public static int LongestSubArray(int[]arr,int k){
        int length=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j];
                if (sum==k) {
                    length=j-i+1;
                    
                }
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[]arr={10, 5, 2, 7, 1, 9};
        int k=15;
        System.out.println(LongestSubArray(arr, k));
    }
}
