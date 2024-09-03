public class Reverse_an_Array {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8};
        System.out.println("The original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("The sorted Array");
        for (int i = arr.length-1; i > 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
