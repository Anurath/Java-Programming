import java.util.Scanner;
class CurrencyConvertor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount (INR) : ");
		float inr= sc.nextFloat();

		float currConverted =  0;

		System.out.println("1 .USD");
		System.out.println("2 .PKR");
		System.out.println("3 .URO");
		System.out.println("4 .REND");
		System.out.println("5 .YUAN");


		System.out.print("Enter the currency : ");
		String curr= sc.next().toUpperCase();

		if (curr.equals("USD"))
		{
			currConverted=inr/86.56f;
			System.out.println(inr + " INR = "+currConverted+" USD");
		}
		else if (curr.equals("PKR"))
		{
			currConverted=inr/0.31f;
			System.out.println(inr + " INR = "+currConverted+" PKR");
		}
		else if (curr.equals("URO"))
		{
			currConverted=inr/90.25f;
			System.out.println(inr + " INR = "+currConverted+" URO");
		}
		else if (curr.equals("REND"))
		{
			currConverted=inr/0.22f;
			System.out.println(inr + " INR = "+currConverted+" REND");
		}
		else if (curr.equals("YUAN"))
		{
			currConverted=inr/11.94f;
			System.out.println(inr + " INR = "+currConverted+" YUAN");
		}
		else
		{
			System.out.println("INVALID INPUT");
		}
	}
}