public class Question64 {
    public static void main(String[] args) {
        int[]arr={1,2,4,2,1};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        int sum1=0;
        System.out.println(sum);
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                sum1 = arr[i] ^arr[i];
            }
            
        }
        System.out.println(sum1);
        int result = sum + sum1;
        System.out.println(result);
        
    }
}
