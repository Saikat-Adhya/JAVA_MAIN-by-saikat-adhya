    import java.util.ArrayList;

    public class Arraylist {
        public static void main(String[] args) {
            int[] arr = {10, 5, 10, 15, 10, 5};
        
        // Step 2: Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num); // Add each element from the array
        }
        
        // Step 3: Manipulate the ArrayList
        list.set(0, 20); // Update the first element
        list.add(30);    // Add a new element at the end
        list.remove(1);  // Remove the element at index 1
        
        System.out.println("Modified ArrayList: " + list);
        }
    }
