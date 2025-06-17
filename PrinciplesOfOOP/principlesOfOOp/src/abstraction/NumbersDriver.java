package abstraction;

public class NumbersDriver {
	public static void main(String[] args)
	{
		Numbers n1 = new NumbersImp();
		
		System.out.println(n1.emirp(17));
	}
}

