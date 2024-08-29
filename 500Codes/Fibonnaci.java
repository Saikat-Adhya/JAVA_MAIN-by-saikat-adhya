public class Fibonnaci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int sum=a+b;
        System.out.print(a+","+b);
        for (int i = 2; i < 5; i++) {
            int nextterm= a+b;
            a=b;
            b=nextterm;
            System.out.print(","+nextterm);
            sum+=nextterm;
        }
        System.out.println();
        System.out.println(sum);
    }
}
