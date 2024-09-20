public class Question28 { // COunt vowels and consunants
    public static void main(String[] args) {
        String s ="Saikat Adhya";
        String Main = s.toLowerCase();
        int length=Main.length();
        int vow=0;
        int constu =0;
        int space =0;
        for (int i = 0; i < length; i++) {
            char word = Main.charAt(i);
            if (word == 'a'||word == 'e'||word == 'i'||word == 'o'||word == 'u') {
                vow++;
            }
            else if (word>='a' && word <='z') {
                constu++;
            }
            else if (word == ' ') {
                space++;
            }
        }
        System.out.println(vow);
        System.out.println(constu);
        System.out.println(space);
    }
}
