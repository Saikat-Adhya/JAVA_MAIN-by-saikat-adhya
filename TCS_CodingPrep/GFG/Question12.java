public class Question12 {
    public static void main(String[] args) {
        int[]arr={1,9,8,37,5};
        int max=0;
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
            if (min>arr[i]) {
                min=arr[i];
            }
            
        }
        System.out.println("MaxDiff: "+ (max-min));
    }
}
