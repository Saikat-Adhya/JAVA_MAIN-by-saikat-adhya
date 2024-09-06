public class Count_number {
    public static void main(String[] args) {
        int x=1;
        int[]arr={1,2,4,3,5};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>x) {
                x++;
            }
        }
        System.out.println(x);
    }
}
