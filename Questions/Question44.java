import java.util.Scanner;

public class Question44 {
    public static void main(String[] args) {
        int result=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter your daily "+(i+1)+" Workout time: ");
            arr[i]=sc.nextInt();
            result+=arr[i];
        }
        System.out.println("The total Excercise duration of the week is : "+result);
        int avgtime= result/n;
        System.out.println("The average daily workout duration: " +avgtime);

    }
}
