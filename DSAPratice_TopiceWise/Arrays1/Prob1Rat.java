// // Problem Description :
// The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

// Note:

// Return -1 if the array is null
// Return 0 if the total amount of food from all houses is not sufficient for all the rats.
// Computed values lie within the integer range.
// Example:

// Input:

// r: 7
// unit: 2
// n: 8
// arr: 2 8 3 5 7 4 1 2
// Output:4
public class Prob1Rat {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int r=7;
        int unit=2;
        int [] arr = {2,8,3,5,7,4,1,2};

        if(arr==null){
            System.out.println(-1);
            return;
        }
        int totalfoodsRequired =  r*unit;
        int totalfoods = 0;
        int houses =0;
        for (int i : arr) {

            totalfoods+=i;
            houses++;

            if(totalfoods>=totalfoodsRequired){
                System.out.println(houses);
                return;
            }
        }
        System.out.println(0);
    }
}
