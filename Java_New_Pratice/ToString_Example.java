public class ToString_Example {
    int roll;
    String name;
    String city;

    /**
     * InnerToString_Example
     */
    ToString_Example(int roll,String name,String city) {
        this.roll=roll;
        this.name=name;
        this.city=city;
        
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub

        
        return roll+" "+name+" "+city;
    }
    

    public static void main(String[] args) {
        ToString_Example s1 = new ToString_Example(10, "saikat", "lolkaa");
        System.out.println(s1);
    }
}
