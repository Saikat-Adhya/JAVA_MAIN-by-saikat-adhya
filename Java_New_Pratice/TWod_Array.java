import java.util.Arrays;

public class TWod_Array {

    public static void main(String[] args) {
        int arr[][]={
            {7,7,1},
            {8,1,9},
            {9,7,2,7}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+" ");
                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int[] row : arr) {
            for (int value : row) {
                System.out.print(value + " ");
            }
        }
        
    }
    
}
