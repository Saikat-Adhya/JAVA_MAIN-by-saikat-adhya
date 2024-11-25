import java.util.Scanner;

public class Element_Present_or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your element: ");
        int x = sc.nextInt();
        int[]arr={1,2,4,3,5};
        int s=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                s=arr[i];
            }
        }
        System.out.println("The element is: "+ s);
        if (s==0) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element present in the array");
        }
    }
}
