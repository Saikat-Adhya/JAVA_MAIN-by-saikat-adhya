public class Fibo_N_TH {

    public static void main(String[] args) {
        int ans = FiboNew(7);
        System.out.println(ans);
    }

    static int FiboNew(int n){
        if (n<2) {

           return n;
            
        }
        return FiboNew(n-1)+FiboNew(n-2);
        
    }
    
}
