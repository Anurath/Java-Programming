package exceptions;

public class ObjectPropogation1Driver {
	
	public static void main(String[] args)
	{
		
		ObjectPropogation1 p1 = new ObjectPropogation1();
		
		try
		{
			p1.division(10, 0);
		}
		catch(Throwable e)
		{
			System.out.println("Don't divide by zero");
		}
	}
}
