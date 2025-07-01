package accessModifier;

public class B {
	
	public static void main(String[] args)
	{
		A a1  = new A();  // For private access modifier
		a1.test();  //CTE
		
		P p1 = new P();//For default modifier   CTE
		p1.test();//CTE
	}
}
