class Computer
{
	public Computer(String typer)	
	{
		System.out.println("A " + typer + " has been purchased");
	}
	public Computer()	
	{
		System.out.println("A computer has been purchased");
	}
	public Computer(String typer, float price)	
	{
		System.out.println("A " + typer + " has been purchased of value " + price);
	}
	public void boot()
	{
		System.out.println("Computer is booting up");
	}
}
public class ConsParam
{
	public static void main(String [] args)
	{
		Computer c1 = new Computer("Laptop");
		Computer c2 = new Computer("Desktop",32000.14f);
		Computer c3 = new Computer("Palmtop");
		Computer c4 = new Computer();
		c1.boot();
	}
}