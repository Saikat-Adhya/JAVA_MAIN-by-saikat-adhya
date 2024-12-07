import java.util.HashMap;
import java.util.Map;
public class Question72 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {1, 5, 6, 7, 3, 2, 4, 10,1,5,5,6,3,3,3,3};
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i])+1 );
            }
            else{
                map.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
        System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
