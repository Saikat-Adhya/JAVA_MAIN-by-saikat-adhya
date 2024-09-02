public class FactorialRecursion {

    static int Factorial(int n){
        if (n==0) 
        {
            return 1;
        }
        else{
        return n*Factorial(n-1);

        }

    }
    public static void main(String[] args) {
        System.out.println("The factorial of the number is");
        System.out.println(Factorial(5));
    }
}
