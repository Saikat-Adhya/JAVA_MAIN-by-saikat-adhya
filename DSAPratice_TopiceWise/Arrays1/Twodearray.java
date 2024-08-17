//package DSAPratice_TopiceWise.Arrays1;
public class Twodearray {
    public static void main(String[] args) {
        int [][] TwodArray = {{4, 3}, {6, 8}};
        print2DArray(TwodArray);
    }
    
    public static void print2DArray(int[][] arrays) {
        for (int[] row : arrays) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
