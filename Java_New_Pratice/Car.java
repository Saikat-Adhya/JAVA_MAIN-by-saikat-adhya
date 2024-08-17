import java.io.*;
public class Car implements Serializable{
    String make;
    String model;
    Car(String make, String model){
        this.make=make;
        this.model=model;
    }
    void show(){
        System.out.println("Make: "+make);
        System.out.println("Model: "+ model);
    }
    public static void main(String[] args) {
        try {
            Car c1=new Car("Honda","City");
            File f=new File("c.txt");
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(c1);
            oos.close();
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            Car cc=(Car)ois.readObject();
            cc.show();
        } catch (Exception ioe) {
            System.out.println(ioe);
        }
    }
}
