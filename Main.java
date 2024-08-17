// import java.util.ArrayDeque;
// import java.util.HashSet;
// import java.util.Queue;
// import java.util.Scanner;
// import java.util.Set;

// class Main {
//     static class State {
//         int a, b, steps;

//         public State(int a, int b, int steps) {
//             this.a = a;
//             this.b = b;
//             this.steps = steps;
//         }
//     }

//     static int pourWater(int a, int b, int target) {
//         Set<String> visited = new HashSet<>();
//         Queue<State> queue = new ArrayDeque<>();
//         queue.add(new State(0, 0, 0));

//         while (!queue.isEmpty()) {
//             State current = queue.poll();
//             int x = current.a, y = current.b, steps = current.steps;

//             if (x == target || y == target || x + y == target) {
//                 return steps;
//             }

//             if (visited.contains(x + " " + y)) {
//                 continue;
//             }
//             visited.add(x + " " + y);

//             // Fill vessel a
//             queue.add(new State(a, y, steps + 1));
//             // Fill vessel b
//             queue.add(new State(x, b, steps + 1));
//             // Empty vessel a
//             queue.add(new State(0, y, steps + 1));
//             // Empty vessel b
//             queue.add(new State(x, 0, steps + 1));
//             // Pour from a to b
//             if (x + y <= b) {
//                 queue.add(new State(0, x + y, steps + 1));
//             } else {
//                 queue.add(new State(x - (b - y), b, steps + 1));
//             }
//             // Pour from b to a
//             if (x + y <= a) {
//                 queue.add(new State(x + y, 0, steps + 1));
//             } else {
//                 queue.add(new State(a, y - (a - x), steps + 1));
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt();
//         for (int i = 0; i < t; i++) {
//             int a = scanner.nextInt();
//             int b = scanner.nextInt();
//             int c = scanner.nextInt();
//             System.out.println(pourWater(a, b, c));
//         }
//         scanner.close();
//     }
// }
// 
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int s = scanner.nextInt();

//         for (int t = 0; t < s; t++) {
//             int n = scanner.nextInt();
//             int[][] matrix = new int[n][n];

//             for (int i = 0; i < n; i++) {
//                 for (int j = 0; j < n; j++) {
//                     matrix[i][j] = scanner.nextInt();
//                 }
//             }

//             System.out.println(minChangesToEvenParity(matrix, n));
//         }
//         scanner.close();
//     }

//     private static int minChangesToEvenParity(int[][] matrix, int n) {
//         boolean[][] mustChange = new boolean[n][n];
//         int changes = 0;

//         // Check each cell's orthogonal neighbors
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 int sum = 0;
//                 if (i > 0) sum += matrix[i - 1][j];
//                 if (i < n - 1) sum += matrix[i + 1][j];
//                 if (j > 0) sum += matrix[i][j - 1];
//                 if (j < n - 1) sum += matrix[i][j + 1];

//                 // If sum of neighbors is odd, this cell must change
//                 if (sum % 2 != 0) {
//                     mustChange[i][j] = true;
//                 }
//             }
//         }

//         // Count and change the necessary 0s to 1s
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (mustChange[i][j] && matrix[i][j] == 0) {
//                     changes++;
//                     // When we change a 0 to 1, we need to update the neighbors
//                     if (i > 0) mustChange[i - 1][j] = !mustChange[i - 1][j];
//                     if (i < n - 1) mustChange[i + 1][j] = !mustChange[i + 1][j];
//                     if (j > 0) mustChange[i][j - 1] = !mustChange[i][j - 1];
//                     if (j < n - 1) mustChange[i][j + 1] = !mustChange[i][j + 1];
//                 }
//             }
//         }

//         return changes;
//     }
// }
import java.util.Scanner;

public class Main {

    // Function to count the minimum changes needed to ensure even parity for orthogonal neighbors
    private static int minimumChangesForEvenParity(int[][] matrix, int n) {
        int changes = 0;
        boolean[][] shouldBeEven = new boolean[n][n];

        // Calculate parity requirements for each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;

                // Up neighbor
                if (i > 0) sum += matrix[i - 1][j];
                // Down neighbor
                if (i < n - 1) sum += matrix[i + 1][j];
                // Left neighbor
                if (j > 0) sum += matrix[i][j - 1];
                // Right neighbor
                if (j < n - 1) sum += matrix[i][j + 1];

                // Check if current sum is even or odd
                shouldBeEven[i][j] = (sum % 2 == 0);
            }
        }

        // Try to fix the matrix by converting 0s to 1s where needed
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int current = matrix[i][j];
                int sum = 0;

                // Up neighbor
                if (i > 0) sum += matrix[i - 1][j];
                // Down neighbor
                if (i < n - 1) sum += matrix[i + 1][j];
                // Left neighbor
                if (j > 0) sum += matrix[i][j - 1];
                // Right neighbor
                if (j < n - 1) sum += matrix[i][j + 1];

                boolean isEven = (sum % 2 == 0);

                // If the current cell doesn't match the requirement
                if (isEven != shouldBeEven[i][j]) {
                    if (current == 0) {
                        matrix[i][j] = 1;
                        changes++;
                    }
                }
            }
        }

        // After making the changes, validate if the matrix meets the condition
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                if (i > 0) sum += matrix[i - 1][j];
                if (i < n - 1) sum += matrix[i + 1][j];
                if (j > 0) sum += matrix[i][j - 1];
                if (j < n - 1) sum += matrix[i][j + 1];
                if (sum % 2 != 0) {
                    return -1;
                }
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[][] matrix = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int result = minimumChangesForEvenParity(matrix, n);
            System.out.println(result);
        }

        scanner.close();
    }
}

