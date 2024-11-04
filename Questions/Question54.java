public class Question54 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,0};
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>arr[0]) {
                count++;
            }
        }
        System.out.println(count+1);
    }
}
