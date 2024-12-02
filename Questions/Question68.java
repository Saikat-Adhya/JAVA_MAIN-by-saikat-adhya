public class Question68 {
    public static String removeVowelsBetweenConsonants(String s) {
        // Regular expression to match vowels between consonants
        return s.replaceAll("(?<=[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z])[aeiouAEIOU](?=[b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z])", "");
    }

    public static void main(String[] args) {
        String input = "abecidofu";
        String result = removeVowelsBetweenConsonants(input);
        System.out.println("Modified String: " + result); // Example output: "abcfu"
    }
}
