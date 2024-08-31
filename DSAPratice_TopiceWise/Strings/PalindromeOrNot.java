public class PalindromeOrNot {

    static void Palindrome(String str) {
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }

    public static void main(String[] args) {
        String s = "madam";
        Palindrome(s);
    }
}
