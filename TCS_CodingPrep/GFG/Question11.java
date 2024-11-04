public class Question11 {
    public static void main(String[] args) {
        int[]arr={7,10,4,10,6,5,2};
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>=arr[i]) {
                    flag=true;
                    break;
                }
            }
            if (flag==false) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
