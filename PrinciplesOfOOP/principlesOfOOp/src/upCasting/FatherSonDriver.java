package upCasting;

public class FatherSonDriver {
	public static void main(String[] args)
	{
		Father f1 = new Child();
		f1.displayFather();
		
		
		Child c1  = (Child)f1;
		c1.displayChild();
		c1.displayFather();
	}
}
