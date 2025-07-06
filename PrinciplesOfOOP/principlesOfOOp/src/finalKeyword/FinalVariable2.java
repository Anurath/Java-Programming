package finalKeyword;

public class FinalVariable2 {

	final double PI;
	
	{
//		PI = 22.0/7.0;   //non static final variable can be assigned in non static initializers
	}
	
	FinalVariable2()
	{
		PI=22.0/7.0;         // non static final variable can be assigned in constructor also
	}
	
	public static void main(String[] args)
	{
		FinalVariable2 f1 = new FinalVariable2();
		System.out.println(f1.PI);
	}
}
