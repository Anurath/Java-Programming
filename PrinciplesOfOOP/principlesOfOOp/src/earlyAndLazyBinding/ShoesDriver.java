package earlyAndLazyBinding;

public class ShoesDriver {
	public static void main(String[] args)
	{
		Shoes s1 = new Shoes("Nike","Sport",2000,10);
		s1.displayShoes();
		s1.s.displaySocks();
	}
}
