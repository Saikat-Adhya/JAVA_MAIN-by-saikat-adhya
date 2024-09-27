public class Question34 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6};
        int[]prearr=new int[arr.length];
        prearr[0]=arr[0]; 
        int sum=0;
        int avg=0;
        for (int i = 1; i < arr.length; i++) {
            prearr[i]=prearr[i-1]+arr[i];  //This the prefixsumarray with new array
        }
        for (int i = 0; i < prearr.length; i++) {
            System.out.print(prearr[i]+" ");
        }
// -------------------------------------------------------------------------------------
        System.out.println();
// -------------------------------------------------------------------------------------
        for (int s = 1; s < arr.length; s++) { 
            arr[s]+=arr[s-1];   //This is the prefix sum array without new array
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
            sum+=arr[k];
            avg=sum/arr.length;
        }
        System.out.println();
        System.out.println();
        System.out.println(sum);
        System.out.println(avg);
        
    }
}
