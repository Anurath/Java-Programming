import java.util.Scanner;
class MethodEx1
{
	public static void  main(String[] args)
	{
		RupeeToDoller(200);
	}
	public static void RupeeToDoller(double rup)
	{
		double dol=rup/85.15;
		System.out.println(dol);
		DollerToRend(dol);
	}
	public static void DollerToRend(double dol)
	{
		double rend = dol*18.39;
		System.out.println(rend);
		RendToPakRupee(rend);
	}
	public static void RendToPakRupee(double rend)
	{
		double pakRupee = rend*15.20;
		System.out.println(pakRupee);
	}
}