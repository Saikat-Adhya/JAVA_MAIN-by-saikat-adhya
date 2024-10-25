public class Question53 {
    public static void main(String[] args) {
        String s = "HHTHTHTHHTH";
        int sumH = 2;   
        int sumT = 1;   
        int sumHead = 0;
        int sumTail = 0;
        int score;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'H') {
                sumHead++;
            } else if (ch == 'T') {
                sumTail++;
            }
        }
        System.out.println("Total Heads (H): " + sumHead);
        System.out.println("Total Tails (T): " + sumTail);

        score = (sumHead * sumH) - (sumTail * sumT);

        System.out.println("Total Score: " + score);
    }
}
