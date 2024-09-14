import java.util.Scanner;

public class Question18 {
    static final int MAX = 100000; // As values are less than 10^5

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    
    // Step 1: Read the size of the array and the array elements
    System.out.print("Enter number of elements in array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    // Step 2: Create a lookup array to mark presence of numbers
    boolean[] exists = new boolean[MAX];
    for (int i = 0; i < n; i++) {
      exists[arr[i]] = true; // Mark the number as present
    }
    
    // Step 3: Process the queries
    System.out.print("Enter number of queries: ");
    int q = sc.nextInt();
    System.out.println("Enter the query numbers:");
    for (int i = 0; i < q; i++) {
      int query = sc.nextInt();
      
      // Step 4: Check if the query number exists in the array
      if (query >= 0 && query < MAX && exists[query]) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
    }
    
    sc.close();
  }
}
