import java.util.Arrays;

public class Remove_duplicate_from_Sorted_Array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,1};
        int j=0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]!=arr[i+1]) {
                arr[j++]=arr[i];
            }
            
        }
        arr[j++]=arr[arr.length-1];
        for (int l = 0; l <j; l++) {
            System.out.println(arr[l]);
        }
    }
}
