public class Max_element_of_Array {
    public static void main(String[] args) {
        int max=0;
        int arr[]={1,3,45,6,90};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.print("The max element is: "+max);
    }
}
