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
// ****************************************************************************************************************************************************************
//This is the main Optimal approach with postive numbers and Zero

// 
// public class LongestSubarrayWithKsum {
//     public static void main(String[] args) {
//         int[] arr = {1, 5, 6, 7, 3, 2, 4, 10};
//         int n = arr.length;
//         int left = 0;
//         int right = 0;
//         int k = 16;
//         int sum = arr[0];
//         int length = 0;
                                                    
//         while (right < n) {
//             // Adjust the left pointer if the sum exceeds k
//             while (sum > k && left <= right) {
//                 sum -= arr[left];
//                 left++;
//             }

//             // Check if the current sum equals k
//             if (sum == k) {
//                 length = Math.max(length, right - left + 1);
//             }

//             // Move the right pointer forward
//             right++;
//             if (right < n) { // Ensure right is within bounds before accessing the array
//                 sum += arr[right];
//             }
//         }

//         System.out.println("Length of the longest subarray with sum " + k + ": " + length);
//     }
// }

// ****************************************************************************************************************************************************************
//This is the main Optimal approach with postive numbers and negative with Hashmap
// public int lenOfLongestSubarr(int[] arr, int k) {
//     int n =arr.length;
//     Map<Long, Integer>pMap =  new HashMap<>();
//     long sum=0;
//     int maxLen=0;
//     for(int i=0;i<n;i++){
//         sum+=arr[i];
        
//         if(sum==k){
//             maxLen=Math.max(maxLen,i+1);
//         }
//         long rem =  sum-k;
        
//         if(pMap.containsKey(rem)){
//             int len = i-pMap.get(rem);
//             maxLen = Math.max(maxLen,len);
//         }
//         if(!pMap.containsKey(sum)){
//             pMap.put(sum,i);
//         }
//     }
//     return maxLen;
    
// }