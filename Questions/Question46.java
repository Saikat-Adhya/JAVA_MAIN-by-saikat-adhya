import java.util.Scanner;

public class Question46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the speed of the train(KM/h): ");
        int n =sc.nextInt();
        int Length_of_the_bridge = 400;
        int Distance_covered_by_the_Train = 400;
        int Total_Distance = Length_of_the_bridge+Distance_covered_by_the_Train;
        int convert_speed = n*5/18;
        int total_time = Total_Distance/convert_speed;
        System.out.println("The total time required by the train to cover the bridge: "+total_time+" M/s.");

    }
}
