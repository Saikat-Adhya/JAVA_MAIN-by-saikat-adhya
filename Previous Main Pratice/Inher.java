class Fruit
{
	void reap(){System.out.println("Fruit has ripened");}
}
class CitrusFruit extends Fruit
{
	void taste(){System.out.println("Acidic in taste and content");}
}
class Lemon extends CitrusFruit
{
	void use(){System.out.println("Drink with lukewarm water");}
		
}
public class Inher
{
	public static void main(String [] args)
	{
		Fruit f1 = new Fruit();	CitrusFruit cf = new CitrusFruit();
		Lemon l1 = new Lemon();
		f1.reap();
		cf.taste();cf.reap();	l1.reap();l1.taste();l1.use();				
	}
}