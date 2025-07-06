package finalKeyword;

public class FinalMethod1 extends FinalMethod {
	
	public final static void demo() //CTE
	{
		System.out.println("This is shadowing static final method");
	}
	
	public final void test()                     //CTE
	{
		System.out.println("This is overring non static final method");
	}
}
