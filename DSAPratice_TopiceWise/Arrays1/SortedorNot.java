import java.util.*;
public class SortedorNot {

    static int[] smallestandlargest(int[]arr){
        Arrays.sort(arr);

        int ans[]={arr[0],arr[arr.length-1]};
        return ans;
    }

    static boolean sorted(int[]arr){
        //boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {

                return false;
                
            }
        }
        return true;

    }
    public static void main(String[] args) {
        int[]arr={5,2,3,4,6,8,2,1,0};

        if (sorted(arr)) {
            System.out.println("The array is already sorted"+Arrays.toString(arr));
            
        } else {
            Arrays.sort(arr);
            System.out.println("The array is not sorted.The sorted array is"+Arrays.toString(arr));
            
        }
        int ans[]=(smallestandlargest(arr));
        System.out.println("The smallest element of the array is: "+ans[0]);
        System.out.println("The largest element of the array is: "+ans[1]);
    }
}
