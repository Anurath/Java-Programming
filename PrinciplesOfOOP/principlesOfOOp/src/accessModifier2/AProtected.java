package accessModifier2;

public class AProtected {

	protected int a = 10;
	
	protected AProtected() {}
	
	
	protected void test()
	{
		System.out.println("From test() of class Aprotected.");
	}
	
	protected static void demo()
	{
		System.out.println("From static demo() of class AProtected");
	}
}
