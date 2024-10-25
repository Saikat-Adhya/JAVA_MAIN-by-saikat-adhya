public class Question8 {
    public static void main(String[] args) {
        int[]arr={1,3,5,9,8,7,0,2,4};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int tmp =0;
                if (arr[i]>arr[j]) {
                    tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
