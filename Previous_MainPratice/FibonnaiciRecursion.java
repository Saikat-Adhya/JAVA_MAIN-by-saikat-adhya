public class FibonnaiciRecursion {

    static int Fibo(int n){
        if (n==0 || n==1) {
            return n;
            
        } else {
            return ((Fibo(n-1)+Fibo(n-2)));
            
        }
        

    }
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            System.out.print(Fibo(i)+" ");
            
        }
        

        // int z=Fibo(6);
        // System.out.println(z);
    }
    
}
