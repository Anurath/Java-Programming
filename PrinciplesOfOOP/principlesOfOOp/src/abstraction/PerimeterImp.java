package abstraction;

public class PerimeterImp extends Perimeter {
	public double ractangle(int l,int b)
	{
		return 2*(l+b);
	}
	
	public double triangle(int s1,int s2,int s3)
	{
		return s1+s2+s3;
	}
	
	public double square(int s)
	{
		return s*s;
	}
	
	public double circle(int r)
	{
		return 2*(22/7)*r;
	}
}
