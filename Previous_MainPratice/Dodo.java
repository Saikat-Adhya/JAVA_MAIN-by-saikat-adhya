import java.util.Scanner;

public class Dodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lineNumber = 0;

        // Read input until EOF is reached
        while (scanner.hasNext()) {
            lineNumber++;
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
        }

        scanner.close();
    }
}
