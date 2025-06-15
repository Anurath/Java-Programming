 package abstraction;

public class AreaDriver {
	public static void main(String[] args)
	{
		Area a1 = new AreaImp();
		
		System.out.println(a1.circle(20));
	}
}
