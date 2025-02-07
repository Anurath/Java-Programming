import java.util.Scanner;
class NarrowingToFloat
{
	public static void main(String[] args)
	{
		while(true)
		{
			System.out.print("Enter the number in double : ");
		double num = new Scanner(System.in).nextDouble();

		float fl = (float)num;

		System.out.println("Converted number from Double to float is : "+fl);
		}

	}
}