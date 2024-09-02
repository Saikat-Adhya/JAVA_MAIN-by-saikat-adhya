public class EqualFunction {
    public static void main(String[] args) {
        String s1 = "Saikat";
        String s2 = "Saikat";
        String s3 = new String("Saikat");

        if (s1==s2) {
            System.out.println("The string is equal");
        } else {
            System.out.println("The string is not equal");
        }
        if (s2.equals(s3)) {
            System.out.println("ok Eqal");
        } else {
            System.out.println("not eqal");
        }
    }
}
