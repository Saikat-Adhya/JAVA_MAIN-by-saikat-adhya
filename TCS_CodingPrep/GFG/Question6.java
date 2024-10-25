public class Question6 {
    public static void main(String[] args) {
        int[]arr={1,2,4,5,7,9};
        int max =0;
        int min =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
