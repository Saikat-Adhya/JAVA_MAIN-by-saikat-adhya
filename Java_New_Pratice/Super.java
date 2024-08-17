class A
{
    public A(){
        // super();
        System.out.println("This is A");
    }

    public A(int n){
        super();
        System.out.println("ok AA");
    }
}
class B extends A
{
    public B(){
        // super();
        System.out.println("This B");
    }
    public B(int n){
        super(n);
        System.out.println("ok BB");
    }
}

/**
 * Super
 */
public class Super {

    public static void main(String[] args) {
        B obj = new B(5);
        
    }
}