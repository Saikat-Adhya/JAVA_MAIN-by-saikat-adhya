public class LongestWord {
    public static void main(String[] args) {
        String s = "hello. my .name is_ Santuih"; 
        
        // Split the string into words
        String[] words = s.split(" ");  // Split by space to get individual words
        
        // Initialize a variable to hold the longest word
        String longestWord = "";
        
        // Loop through each word and check its length
        for (int i = 0; i < words.length; i++) {
            // Remove unwanted characters (., _, and spaces)
            String cleanedWord = words[i].replaceAll("[._\\s]", "");
            
            // If the cleaned word is longer than the longestWord so far
            if (cleanedWord.length() > longestWord.length()) {
                longestWord = cleanedWord;
            }
        }
        
        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
