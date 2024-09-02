public class ArrayElementMax {
    public static void main(String[] args) {
        int [] arr ={10,20,3,4,5,6};
        
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            max = arr[i];
        }

        System.out.println("The maximum element of the array is :" + max);
    }
}
