package encapsulationPackage;

public class PenDriver {
	public static void main(String[] args)
	{
		Pen p1 = new Pen("Rorito",50,"Gen");
		p1.displayPen();
		p1.r1.displayRefill();
	}
}
