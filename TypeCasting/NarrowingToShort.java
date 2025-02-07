import java.util.Scanner;
class NarrowingToShort
{
	public static void main(String[] args)
	{
		while(true)
		{
		System.out.print("Enter the number : ");
		int num = new Scanner(System.in).nextInt();
		short sh = (short)num;
		System.out.println("Converted into short : "+sh);
		System.out.println(" ");
		}
	}
}