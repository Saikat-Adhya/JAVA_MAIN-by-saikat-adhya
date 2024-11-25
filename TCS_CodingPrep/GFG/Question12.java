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
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            //System.out.print(arr[i]+" ");
        }
        int m=arr[0];int n= arr[1];
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        System.out.println("MinDiff: "+ (n-m));
        System.out.println("MaxDiff: "+ (max-min));
    }
}
