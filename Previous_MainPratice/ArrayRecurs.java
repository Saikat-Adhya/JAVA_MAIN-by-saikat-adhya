/**
 * ArrayRecurs
 */
public class ArrayRecurs {
    public static void  PrintArray(int []arr, int var){
        if (var == arr.length) {
            return ;
        }

        System.out.print(arr[var]+" ");

        PrintArray(arr, var+1);
    }

    

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        PrintArray(arr, 0);
    }
}