import java.util.Arrays;

public class Second_Largest_element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,3,3,3,3,4,4,4,5,5,5,6,6};
        Arrays.sort(arr);
        // Sort the array in ascending order
        for(int i=arr.length-2;i>=0;i--){
            if (arr[i]!=arr[arr.length-1]){
                System.out.println("The second largest element is: " + arr[i]);
                break;
                
            }
        }
    }
}
