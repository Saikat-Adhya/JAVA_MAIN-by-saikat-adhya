import java.util.*;
public class ArrayListi {

    public static void main(String[] args) {

        ArrayList <Integer> l1= new ArrayList<>();

        l1.add(6);
        l1.add(4);
        l1.add(3);
        l1.add(1);
        l1.add(1,65);// i can add any value at any index.
        l1.set(2,50);// i can modify any element at any index.
        l1.remove(0);//We can easily remove any index from a arrylist.
        if (l1.remove(Integer.valueOf(21))) {
            System.out.println("Ok element remove successfully.");
            
        } else {
            System.out.println("element is not present in the arraylist");
        }
        // I can remove any element from an array without using Indexing.
        System.out.println(l1.remove(Integer.valueOf(30)));

        //If i don't specify the wrapper class of an element then i can easily add any thing in the arryalist
        //Which is a String, Number whaterver.

        ArrayList l= new ArrayList();
        l.add("Saikat Adhya");
        l.add(90);
        System.out.println(l);
        


        System.out.println(l1);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) +" ");
        }
        
    }
}