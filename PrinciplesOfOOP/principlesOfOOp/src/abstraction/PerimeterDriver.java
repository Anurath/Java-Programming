package abstraction;

public class PerimeterDriver {
	public static void main(String[] args)
	{
		Perimeter p1 = new PerimeterImp();
		
		System.out.println(p1.ractangle(3, 5));
	}
}
