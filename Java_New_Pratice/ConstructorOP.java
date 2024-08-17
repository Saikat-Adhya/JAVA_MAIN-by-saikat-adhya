/**
 * ConstructorOP
 */
public class ConstructorOP {
    int roll;
    String name;
    public ConstructorOP(int i, String j){
        roll=i;
        name=j;

    }

    void display(){
        System.out.println(roll+" : "+name);
    }

    public static void main(String[] args) {

        ConstructorOP obj = new ConstructorOP(40, "Saikat Adhya");
        // System.err.println(obj.name);
        obj.display();
        
    }
}