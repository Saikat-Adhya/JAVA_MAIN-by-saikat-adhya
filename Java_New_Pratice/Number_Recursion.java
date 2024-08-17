public class Number_Recursion {
    
    public static void main(String[] args) {
        printNew(0);
    }
    static void printNew(int n){
        if (n==5) {
            System.out.println(5);
            return ;

            
        }
        System.out.println(n);
            printNew(n+1);
    }
    
}


