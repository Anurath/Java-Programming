package interfaces;

public class PerimeterImp implements Perimeter {
	
	@Override
	public double circle(double rad)
	{
		return 2*PI*rad;
	}
	
	@Override
	public double ractangle(double l, double b)
	{
		return 2*(l+b);
	}
	
	@Override
	public double triangle(double s1,double s2,double s3)
	{
		return s1+s2+s3;
	}
	
	@Override
	public double square(double s)
	{
		return s*4;
	}
}
