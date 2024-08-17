import java.util.Scanner;
public class ElementPresentorNotinArray {

       public static void main(String[] args) {
        int[]arr={3,4,5,6,7,8,9,2,1,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elemnt which you have to found: ");
        int x=sc.nextInt();
        int ans=-1;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i]==x) {
                ans=i;

                break;

                
            }
            
        }if (ans==-1) {
            System.out.println("Given element not found.");
            
        } else {
            System.out.println("The element is present in the index" +" "+ans+" "+"The element is"+" "+x);
        }
        
        

    
    }
    
}
