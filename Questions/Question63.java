import java.util.Scanner;

public class Question63 {

    public static void calHypotenus(int a, int b) {
        double hypotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        int roundHypotenus = (int) Math.round(hypotenus);
        System.out.println("The hypotenus is: " + roundHypotenus);
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of sides of the triangle: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        calHypotenus(a, b);
    }
    sc.close();
    
 }   
}
