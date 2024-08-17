public class SumOfDigitRecurssion {

    static long Sumof(long n){
        if (n>0 && n<=9) {
            return n;
            
        } else {
            return(Sumof(n/10)+Sumof(n%10));
            
        }
    }
    public static void main(String[] args) {
        System.out.println("The sum of the digit is: ");
        System.out.println(Sumof(56789));
        
    }
}
