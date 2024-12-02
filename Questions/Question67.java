import java.util.ArrayList;
import java.util.Scanner;

public class Question67 {

    public static ArrayList<Integer>findMaxProductPair(int[]arr,int k){
        ArrayList<Integer> list=new ArrayList<>();
        int maxProduct=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==k) {
                    int product=arr[i]*arr[j];
                    if(product>maxProduct){
                        maxProduct=product;
                        list.clear();
                        if (arr[i]>arr[j]) {
                            list.add(arr[j]);
                            list.add(arr[i]);
                            
                        }
                        else{
                            list.add(arr[i]);
                            list.add(arr[j]);
                        }
                    }
                }
            }
        }
        return list.isEmpty()?null:list;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the elements: ");
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = findMaxProductPair(arr, 12);
        if(list==null){
            System.out.println("No such pair found");
        }
        else{
            System.out.println("The pair is: "+list);
        }
        
    }
}
