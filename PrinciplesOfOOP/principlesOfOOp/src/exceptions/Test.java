package exceptions;

public class Test {

	public void division(int a , int b)
	{
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		catch(ClassCastException e)
		{
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("From Finally Block.");
		}
	}
}
