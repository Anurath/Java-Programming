import java.util.Scanner;
class NarrowingToInt
{
	public static void main(String[] aggs)
	{
		while(true)
		{
		System.out.print("Enter the number : ");
		double num=  new Scanner(System.in).nextDouble();

		int it = (int)num;
		System.out.println("Converted double to int is : "+it);

		}
	}
}