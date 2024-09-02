public class Earth
{
	public static void main(String [] args)
	{
		Human e1; //object declaration

		e1 = new Human(); // object instantiation

		Human e2 = new Human();
		System.out.println("Setting the details....");
		e1.setDetails();e2.setDetails();

		System.out.println("Printing the details....");
		e1.getDetails();e2.getDetails();

		System.out.println("Executing the objects....");
		e1.run();e2.run();
		System.out.println("Creating anonymous objects...");
		new Human().run();
		


	}
}