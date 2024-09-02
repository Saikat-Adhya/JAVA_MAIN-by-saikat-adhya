import java.util.*;
import java.util.Collections;
public class ArraylistReversee {
    // static void Reverse(ArrayList<Integer>l1){
    //     int i=0, j=l1.size()-1;
    //     while (i<j) {
    //         Integer temp = Integer.valueOf(l1.get(i));
    //         l1.set(i, l1.get(j));
    //         l1.set(j, temp);
            
    //         i++;
    //         j--;
    //     }

    // }
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();

        l1.add(20);
        l1.add(21);
        l1.add(22);
        l1.add(23);
        l1.add(24);
        l1.add(25);
        System.out.println("The original list is : "+l1);
        //Reverse(l1);
        
        //System.out.println("The reverse array list is : "+l1);

        //Using Collection of revese 
        Collections.reverse(l1);

        System.out.println("Using collection reverse to a arraylist:"+ l1);
    }
    
    
}
