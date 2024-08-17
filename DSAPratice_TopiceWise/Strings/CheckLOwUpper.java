public class CheckLOwUpper {
    public static void main(String[] args) {
        String str = "HelloWorLD";  // Example input

        int upperCaseCount = 0;
        int lowerCaseCount = 0;

        // Count the number of uppercase and lowercase letters
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            }
        }

        // Determine if the string should be converted to uppercase or lowercase
        String result;
        if (upperCaseCount > lowerCaseCount) {
            result = str.toUpperCase();
        } else {
            result = str.toLowerCase();
        }

        // Print the result
        System.out.println(result);
    }
}
