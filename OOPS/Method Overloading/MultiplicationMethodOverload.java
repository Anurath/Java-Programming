import java.util.Scanner;
class MultiplicationMethodOverload
{
	public static void main(String[] args)
	{
		System.out.println(mult(10.4,2.1));
	}
	public static double mult(double x,double y)
	{
		return x*y;
	}
	public static int mult(byte x,int y)
	{
		return x*y;
	}
	public static double mult(int x,int y)
	{
		return x*y;
	}
}