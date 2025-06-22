package interfaces;

public class PerimterDriver {
	public static void main(String[] args)
	{
		Perimeter p1 = new PerimeterImp();
		System.out.println(p1.circle(12));
		System.out.println(p1.triangle(10, 20, 30));
		System.out.println(p1.square(10));
		System.out.println(p1.ractangle(10, 20));
		System.out.println(p1.trapazium(23, 34));
	}
}
