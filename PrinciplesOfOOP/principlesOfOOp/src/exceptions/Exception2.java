package exceptions;

public class Exception2 {
	
	
	public void division(int n,int d)
	{
		try {
			System.out.println(n/d);
		}
		catch(NullPointerException e)
		{
			System.out.println("From null ponter exception");
		}
		catch(ClassCastException e)
		{
			System.out.println("From class cast exceptoin");
		}
		catch(ArithmeticException e)
		{
			System.out.println("From arithmetic exception");
		}
	}
}
