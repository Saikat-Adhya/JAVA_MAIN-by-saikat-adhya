import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(51);
        list.add(52);
        list.add(53);
        list.add(54);
        list.add(55);
        list.add(56);
        list.add(57);
        list.add(58);
        System.out.println("********************************");
        System.out.println(list);
        System.out.println("--------------------------------");
        list.remove(2);
        System.out.println(list);
        System.out.println("--------------------------------");
        list.set(2, 100);
        System.out.println(list);
        System.out.println("********************************");



        
        
    }
}
