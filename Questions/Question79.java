import java.util.Scanner;

public class Question79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int[] rank = new int[n];
       
        for (int i = 0; i <n; i++) {
            System.out.println("Enter the rank of student " + (i+1) + ": ");
            rank[i] = sc.nextInt();
        }
        int minrank = rank[0];
        int cuts = 0;
        for (int i = 0; i < rank.length; i++) {
            if (rank[i] < minrank) {
                minrank = rank[i];
                cuts++;
                
            }
        }
        System.out.println("Number of cuts required: " + cuts);

    }
}
