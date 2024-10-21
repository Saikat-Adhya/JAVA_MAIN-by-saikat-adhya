public class Question1 {
    public static void main(String[] args) {
      int[]arr={1,3,4,3,2};
      int result =-1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    result = arr[i];
                    break;
                }
            }
            if (result!=-1) {
                break;
            }
        }
        System.out.println(result);
    }
}
