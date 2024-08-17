public class SumofArray {

    public static void main(String[] args) {
        
        int []arr ={1,3,4,6,4,1};

        int sum=0;

        for (int s : arr) {
            System.out.print(s+" ");

            // or // sum=sum+s;
            sum+=s;
        }
        System.out.println();
        System.out.println("The total is sum of the array is :"+sum);
    }
    
}
