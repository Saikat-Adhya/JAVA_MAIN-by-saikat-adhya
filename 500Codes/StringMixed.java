public class StringMixed {
    public static void main(String[] args) {
        String s1 = "saikat";
        String s2 = "adhya"; // Step 2: Concatenate two strings

        StringBuilder sb = new StringBuilder();
        int maxLength = Math.max(s1.length(), s2.length());

        for (int i = 0; i < maxLength; i++) {
            if (i < s1.length()) {
                sb.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                sb.append(s2.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
