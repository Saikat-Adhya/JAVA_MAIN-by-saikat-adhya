public class Question77 {

    public static String Checker(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "ABC65D19HY09";
        String result = Checker(s);
        System.out.println(result);  
    }
}

