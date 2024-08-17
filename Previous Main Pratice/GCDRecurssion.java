public class GCDRecurssion {

    public static int FindIGcd(int x, int y){
        while (x%y!=0) {
            int reminder =x%y;
            x=y;    
            y=reminder;
            
        }
        return y;
    }
    public static void main(String[] args) {
        System.out.println("The GCD of two numbers is: ");
        System.out.println(FindIGcd(11, 7));
    }
}
