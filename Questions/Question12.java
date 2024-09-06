public class Question12 {

    static int Repeat(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return arr[i];
                }
                
            }
        }
        return -1;
    }

    static void PrintArr(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,2,3};
        int result=Repeat(arr);
        System.out.println(result);
    }
}
