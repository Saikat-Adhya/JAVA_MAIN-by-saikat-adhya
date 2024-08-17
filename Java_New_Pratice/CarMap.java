import java.util.*;
class Car
{
    String make ;
    String model;
    Car(String make , String model)
    {
        this.make = make ;
        this.model = model ;
    }
    void show()
    {
        System.out.println("Make  : "+make);
        System.out.println("Model  : "+model);
    }
}

class CarMap
{
    public static void main(String[] args)
    {
        Car c1 = new Car("Honda" , "City") ;
        Car c2 = new Car("Hyundai" , "Alcazar") ;
        Car c3 = new Car("Suzuki" , "Brezza") ;
        Car c4 = new Car("Renault" , "Kwid") ;
        Car c5 = new Car("Tata" , "Nexon") ;
        HashMap hm = new HashMap() ;
        hm.put("C1",c1);
        hm.put("C2",c2);
        hm.put("C3",c3);
        hm.put("C4",c4);
        hm.put("C5",c5);
        Set s = hm.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext())
            {
                Map.Entry me = (Map.Entry)it.next();
                String key = (String)me.getKey();
                Car c = (Car)me.getValue();
                System.out.println("Key : "+key);
                c.show();
            }
    }
}