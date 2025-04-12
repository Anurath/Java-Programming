package earlyAndLazyBinding;

public class BottlerDriver {
	public static void main(String[] args)
	{
		Bottle b1 = new Bottle("Bisleri",20,25,2.4,"Transperent",0.7,"White","Plastic");
		b1.displayBottle();
		b1.c.displayCap();
	}
}
