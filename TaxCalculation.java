import java.util.Scanner;
class TaxCalculation
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Annual Income : ");
		float tax =0;
		float income = sc.nextFloat();
		if (income>10_00_000)
		{
			tax+=(income*30)/100;
			System.out.print("Tax to be paid : "+tax);
		}
		else if (income>5_00_000)
		{
			tax+=(income*20)/100;
			System.out.println("ax to be paid :"+tax);
		}
		else if (income>2_50_500)
		{
			tax+=(income*5)/100;
			System.out.println("ax to be paid : "+tax);
		}
		else if (income<2_50_000)
		{
			System.out.println("You don't have to any tax.");
		}
	}
}