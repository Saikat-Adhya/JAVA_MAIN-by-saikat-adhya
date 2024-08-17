import java.util.*;

public class NeedleInHaystack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int needleLength = scanner.nextInt();
            String needle = scanner.next();
            String haystack = scanner.next();

            List<Integer> occurrences = kmpSearch(needle, haystack);
            printOccurrences(occurrences);
            if (scanner.hasNext()) {
                System.out.println(); // Print newline between test cases
            }
        }

        scanner.close();
    }

    public static List<Integer> kmpSearch(String needle, String haystack) {
        List<Integer> positions = new ArrayList<>();
        int[] lps = computeLPSArray(needle);

        int i = 0, j = 0;
        while (i < haystack.length()) {
            if (needle.charAt(j) == haystack.charAt(i)) {
                j++;
                i++;
            }
            if (j == needle.length()) {
                positions.add(i - j);
                j = lps[j - 1];
            } else if (i < haystack.length() && needle.charAt(j) != haystack.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return positions;
    }

    public static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    public static void printOccurrences(List<Integer> occurrences) {
        if (occurrences.isEmpty()) {
            System.out.println("-1");
            return;
        }
        for (int position : occurrences) {
            System.out.println(position);
        }
    }
}
