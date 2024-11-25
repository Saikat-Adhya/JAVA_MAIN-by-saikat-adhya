public class Sort_an_Array {
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
        System.out.println();
        for (int i1 = 0; i1 < arr.length; i1++) {
            for (int j1 = i1+1; j1 < arr.length; j1++) {
                int tmp =0;
                if (arr[i1]<arr[j1]) {
                    tmp=arr[i1];
                    arr[i1]=arr[j1];
                    arr[j1]=tmp;
                }
            }
            System.out.print(arr[i1]+" ");
        }
        
    }
    
}