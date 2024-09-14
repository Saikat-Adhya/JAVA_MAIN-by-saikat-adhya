public class Question20 {
    static void Reverse(int[]arr, int left, int right){
        int temp;
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
    static void Rotate(int[]arr){
        int left=0;
        int right=arr.length-1;
        while (left<right) {
            if (arr[left]%2==1 && arr[right]%2==0) {
                Reverse(arr, left, right);
                left++;
                right--;
            }
            if (arr[left]%2==0) {
                left++;
            }
            if (arr[right]%2==1) {
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        Rotate(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
