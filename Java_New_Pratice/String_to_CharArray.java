public class String_to_CharArray {
    public static void main(String[] args) {
        String a= "SaikatAdhya";
        char ch[]=a.toCharArray();
       

        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
            
        }

        System.out.println(ch.length);
        // System.out.println(a);
    }
}
