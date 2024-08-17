public class MaxElementofArray {
    public static void main(String[] args) {
        
        int[]arr = {4,3,5,6,7,100,200};

        int max=0;
        int min=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>max) {

                max=arr[i];
            }
            if (arr[i]<min) {

                min=arr[i];
                
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
