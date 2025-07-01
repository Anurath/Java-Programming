package accessModifier;

public class A {
	private int a = 10;
	
	private void test()
	{
		System.out.println("From test of class A");
	}
	
	private static void demo()
	{
		System.out.println("From static demo of class A");
	}
	
	
	public static void main(String[] args)
	{
		A a1 = new A();
		
		a1.test();
		
		demo();
	}
}
