public class Min_element_of_an_array {
    public static void main(String[] args) {
        int[]arr={0,1,2,3,5,6};
        int min=arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
