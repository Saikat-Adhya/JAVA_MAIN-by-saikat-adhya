public class Question62 {

    public static int swithCount(int[] arr) {
        int swithchCount = 0;
        int flipped = 0;
        for (int i = 0; i < arr.length; i++) {
            int effectiveState = arr[i] ^ flipped;
            if (effectiveState == 0) {
                swithchCount++;
                flipped ^= 1;
                
            }
        }
        return swithchCount;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1};
        System.out.println(swithCount(arr));
    }
}
