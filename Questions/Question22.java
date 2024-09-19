public class Question22 {
    public static void main(String[] args) {
        int s=2;
        int e=5;
        double sum=0;
        for (int i = s; i <= e; i++) {
            double z= Math.pow(i,3);
            sum+=z;
        }
        System.out.println(sum);
}
}
