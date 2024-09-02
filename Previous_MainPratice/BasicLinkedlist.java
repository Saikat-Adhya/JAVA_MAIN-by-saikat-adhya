import java.util.LinkedList;

public class BasicLinkedlist {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Adding an element at a specific index
        linkedList.add(1, "Grapes");

        // Displaying the LinkedList after adding an element
        System.out.println("LinkedList after adding an element: " + linkedList);

        // Removing an element
        linkedList.remove("Banana");

        // Displaying the LinkedList after removing an element
        System.out.println("LinkedList after removing an element: " + linkedList);

        // Getting the size of the LinkedList
        System.out.println("Size of the LinkedList: " + linkedList.size());

        // Checking if the LinkedList contains a specific element
        System.out.println("Does the LinkedList contain 'Orange'? " + linkedList.contains("Orange"));

        // Getting an element at a specific index
        System.out.println("Element at index 2: " + linkedList.get(2));

        // Removing all elements from the LinkedList
        linkedList.clear();

        // Displaying the LinkedList after clearing
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
