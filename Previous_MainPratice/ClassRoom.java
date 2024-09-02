class Computer
{
	public Computer()	//non-parameterized constructor //default
	{
		System.out.println("A computer has been purchased");
	}
	public void boot()
	{
		System.out.println("Computer is booting up");
	}
}
public class ClassRoom
{
	public static void main(String [] args)
	{
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		Computer c3 = new Computer();
		new Computer();new Computer();
		c1.boot();
	}
}