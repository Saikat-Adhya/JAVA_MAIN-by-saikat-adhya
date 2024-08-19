public class SecondLargestElementofArray {
    public static void main(String[] args) {
        int[]arr={1,3,5,6,3,2};
        int max=0;
        int secondmax=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {

                secondmax=max;
                max=arr[i];
                
            }
            else if (arr[i]>secondmax && arr[i]!=max) {
                secondmax=arr[i];
                
            }
        }
        System.out.println(secondmax);
    }
}
