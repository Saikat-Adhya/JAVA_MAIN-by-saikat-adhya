public class Question65 {
    public static void main(String[] args) {
        String s = "hello. my .name is_ Santuih"; 
        
        // Clean the string by removing unwanted characters (., _, and spaces)
        s = s.replaceAll("[._]", "");
        
        // Split the cleaned string into words
        String[] words = s.split(" ");  // Split by one or more spaces
        
        // Initialize a variable to hold the longest word
        String longestWord = "";
        
        // Loop through each word and check its length
        for (String word : words) {
            // If the word is longer than the longestWord so far
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        // Print the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
