public class Question39 {
    public static void main(String[] args) {
        int[][]arr1 = {{1,2},{3,4}};
        int[][]arr2 = {{2,3},{4,5}};
        int[][]newarr = new int[2][2];
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                newarr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[i].length; j++) {
                System.out.print(newarr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
