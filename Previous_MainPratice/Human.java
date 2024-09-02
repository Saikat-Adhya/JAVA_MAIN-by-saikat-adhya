import java.util.*;
public class Human
{
	//member variables
	int age;String name;char gender;
	//member methods
	public void run()
	{
		System.out.println(name + " is running");
	}
	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name:");name = sc.next();
		System.out.print("Enter age:");	age = sc.nextInt();
		System.out.print("Enter gender:");gender = sc.next().charAt(0);
	}
	public void getDetails()
	{
		System.out.println(name + " is a " + gender + " of age " + age); 	
	}
}