public class MaxElement_In_Array {
    
    public static void main(String[] args) {
        int arr[]={1,2,5,6,7,3,3};
        int maxi=largest(arr);
        System.out.print(maxi);
    }

    public static int largest(int arr[]){
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];                
            }
            // int temp = arr[0];
            // arr[0]= arr[max];
            // arr[max]=temp;
            
        }
        
        return max;
    }
}
