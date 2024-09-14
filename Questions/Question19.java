public class Question19 {
    static void Swap(int[]arr,int s, int e) {
        int temp;
        temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        // while (s<e) {
        //     int temp;
        //     temp=arr[s];
        //     arr[s]=arr[e];
        //     arr[e]=temp;
        //     s++;
        //     e--;
        // }
    }
    static void Sort(int[]arr){
        int s=0;
        int e =arr.length-1;
        while (s<e) {
            if (arr[s]==1 && arr[e]==0) {
                Swap(arr, s, e);
                s++;
                e--;
            }
            if (arr[s]==0) {
                s++;
            }
            if (arr[e]==1) {
                e--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1,0,0,0,1,1,0,1,0,1,0};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
