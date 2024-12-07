import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        // Add elements to the HashMap  
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");
        // Print the HashMap
        System.out.println(map);
        // Update the value in HashMap
        map.put(1, "Apricot"); // Update the value at key 1
        System.out.println(map);

        if (map.containsKey(2)) {
            System.out.println("Key 2 is present in the HashMap");
        }
        else{
            System.out.println("Key 2 is not present in the HashMap");
        }
        // Remove an element from the HashMap
        map.remove(3); // Remove the element with key 3
        System.out.println(map);

        // Get the value at key 4
        System.out.println("Value at key 4: " + map.get(4));

        // Get the size of the HashMap
        System.out.println("Size of the HashMap: " + map.size());

        // Check if the HashMap is empty
        if (map.isEmpty()) {
            System.out.println("HashMap is empty");
        } else {
            System.out.println("HashMap is not empty");
        }

        // Clear the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);

        
    }
}
