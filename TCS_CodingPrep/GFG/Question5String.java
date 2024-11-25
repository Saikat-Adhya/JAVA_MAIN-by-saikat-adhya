public class Question5String {

    public static boolean isSubstring(String s, String sub){
        int j=0;
        for (int i = 0; i < s.length() && j<sub.length(); i++) {
            if (s.charAt(i)==sub.charAt(j)) {
                j++;
            }
        }
        return j == sub.length();
    }
    public static void main(String[] args) {
        String s = "Hello";
        String sub = "llo";
        System.out.println(isSubstring(s, sub));
    }
}
