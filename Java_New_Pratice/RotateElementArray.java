public class RotateElementArray {
    public static void main(String[] args) {
        int arr[]={1,9,3,2,4,0};
        // swap(arr, 0, 2);
        rotate(arr);
        for (int i : arr) {
            System.out.print(i+" ");
            
        }
        
    }

    static void rotate(int[]arr){
        int start =0;
        int end = arr.length-1;

        while (start<end) {
            swap(arr, start, end);

            start++;
            end--;
            
        }
    }

    static void swap(int[]arr,int index1,int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]=temp;

    }
}
