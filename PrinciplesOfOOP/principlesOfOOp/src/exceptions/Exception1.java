package exceptions;

public class Exception1 {

	public void division(int n,int d)
	{
		try
		{
			System.out.println(n/d);
		}
		catch(Throwable e)
		{
			System.out.println(e);
		}
	}
}
