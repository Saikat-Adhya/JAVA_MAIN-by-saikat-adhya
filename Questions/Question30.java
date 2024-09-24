public class Question30 {
    public static void main(String[] args) {
        String s = "Saikat Adhya";
        int m= s.length();
        String Main = s.toLowerCase();
        String result ="";

        for (int i = 0; i < m; i++) {
            char ch = Main.charAt(i);

            if (ch!=' ') {
                result+=ch;
            }
        }
        System.out.println(result);
    }
}
