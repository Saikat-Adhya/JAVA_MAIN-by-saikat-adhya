class Fruit
{
	public Fruit(){System.out.println("Fruit got ripened");}
}
class CitrusFruit extends Fruit
{
	public CitrusFruit(){System.out.println("Citrus Fruit got ripened");}	
}
class Lemon extends CitrusFruit
{
	public Lemon(){System.out.println("Lemon Fruit got ripened");}			
}
public class ConsInher
{
	public static void main(String [] args)
	{
		Fruit f1 = new Fruit();
		CitrusFruit cf = new CitrusFruit();
		Lemon l1 = new Lemon();
	}
}