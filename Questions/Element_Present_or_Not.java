public class Element_Present_or_Not {
    public static void main(String[] args) {
        int[]arr={1,2,4,3,5};
        int x=4;
        int s=-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                s=i;
            }
        }
        if (s==-1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present in the array");
        }
    }
}
