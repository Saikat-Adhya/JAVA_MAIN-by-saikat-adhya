class Area
{
	public double calArea(double r){return Math.PI*r*r;}
	public int calArea(int l,int b){return l*b;}
	public float calArea(float b,float h){return 0.5f*b*h;}
}
class Surface
{
	public static void main(String [] args)
	{
		Area a1 = new Area();

		System.out.println("Area of circle is " + a1.calArea(10.00));

		System.out.println("Area of rectangle is " + a1.calArea(10,20));

		System.out.println("Area of triangle is " + a1.calArea(10.0f,20.0f));

	}
}