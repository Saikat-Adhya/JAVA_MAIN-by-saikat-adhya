class Hello{
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {

        Hello obj = new Hello();
        obj.setAge(100);
        int z= obj.getAge();
        System.out.println(z);
        
        
    }
}
