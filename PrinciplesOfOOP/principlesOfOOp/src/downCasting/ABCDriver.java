package downCasting;

public class ABCDriver {
	public static void main(String[] args)
	{
		A a1 = new C();  //Upcasting
		
		B b1 = (B)a1;  //Down Casting 
		
		C c1 = (C)b1;  //Down Casting
		
		c1.displayA();
		c1.displayB();
		c1.displayC();
		
	}
}
