package abstraction;

public class AreaImp extends Area {
	public double circle(int r)
	{
		return 3.14*r*r;
	}
	
	public double ractangle(int l,int b)
	{
		return l*b;
	}
	
	public double square(int s)
	{
		return s*s;
	}
}
