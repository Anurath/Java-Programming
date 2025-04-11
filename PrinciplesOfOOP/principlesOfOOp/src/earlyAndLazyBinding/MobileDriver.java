package earlyAndLazyBinding;

public class MobileDriver {
	public static void main(String[] args)
	{
		Mobile m1 = new Mobile("Remdi 13",14000,"5G","TypeC","C",1500);
		m1.displayMobile();
		m1.c.displayCharger();
	}
}
