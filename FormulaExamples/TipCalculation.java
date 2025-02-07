import java.util.Scanner;
class TipCalculation
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the bill amount : ");
		float bill = sc.nextFloat();

		System.out.print("Enter the Tip rate : ");
		float tipRate=sc.nextFloat();

		float tip = (bill*tipRate)/100;
		float totalBill = bill+tip;
		System.out.println("----Tip Added----");
		System.out.println("Tip is : "+tip);
		System.out.println("The total bill is : "+totalBill);
	}
}