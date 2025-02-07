import java.util.Scanner;
class NorrowingToLong
{
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.print("Enter number in Double: ");
		double num = new Scanner(System.in).nextDouble();

		System.out.print("Enter the number in float : ");
		float num1 = new Scanner(System.in).nextFloat();

		long lg1=(long)num1;
		long lg = (long)num;

		System.out.println("Converted number double to long :"+lg);
		System.out.println("Converted number double to long :"+lg1);
		}
	}
}
