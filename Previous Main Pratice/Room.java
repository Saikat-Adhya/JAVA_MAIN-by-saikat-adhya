public class Room {
    public static void main(String[] args) {
        // Declaring an array of integers
        int[] numbers;

        // Initializing the array with 5 elements
        numbers = new int[5];

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Accessing and printing array elements
        System.out.println("Element at index 0: " + numbers[0]);
        System.out.println("Element at index 1: " + numbers[1]);
        System.out.println("Element at index 2: " + numbers[2]);
        System.out.println("Element at index 3: " + numbers[3]);
        System.out.println("Element at index 4: " + numbers[4]);

        // Initializing and declaring an array in one line
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        // Accessing and printing array elements
        System.out.println("Fruit at index 0: " + fruits[0]);
        System.out.println("Fruit at index 1: " + fruits[1]);
        System.out.println("Fruit at index 2: " + fruits[2]);
        System.out.println("Fruit at index 3: " + fruits[3]);
    }
}
