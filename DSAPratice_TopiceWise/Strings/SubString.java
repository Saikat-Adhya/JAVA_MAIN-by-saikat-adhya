public class SubString {

    public static String Subs(String str,int s, int e){
        String substr="";
        for (int i = s; i <e; i++) {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String s =Subs(str, 0, 5);
        System.out.println(s);
    }
}
