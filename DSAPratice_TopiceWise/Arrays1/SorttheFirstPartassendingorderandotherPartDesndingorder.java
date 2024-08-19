import java.util.*;
public class SorttheFirstPartassendingorderandotherPartDesndingorder {

    static void questionWise(int[]arr){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length/2; i++) {
            int s=arr[i];
            System.out.print(s+" ");             //This is for the first part assending order
        }

        for (int j = arr.length - 1; j >= arr.length / 2; j--)
      {
         System.out.print(arr[j] + " ");        //This is for the second part dessending order
      }

    }
    public static void main(String[] args) {
        int[]arr={3, 2, 4, 1, 10, 30, 40, 20,90,100};
        questionWise(arr);
    }
    
}
