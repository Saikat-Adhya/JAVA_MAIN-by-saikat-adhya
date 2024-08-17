import java.util.Scanner;
public class ElementPresent {

    static int Counttime(int[]arr,int x){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            // if (arr[i]==x) {
            //     count++;
            // }
            if (arr[i]>x) {
                count++;
                
            }
            
        }
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        int x =sc.nextInt();
        
        int[]arr={5,3,2,1,3,3,5};

       // Counttime(arr, 5);

        System.out.println(Counttime(arr, x));
    }
}
