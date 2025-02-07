import java.util.Scanner;
class NarrowingByte
{
	public static void main(String[] args)
	{
		System.out.print("Enter the number : ");
		int num= new Scanner(System.in).nextInt();
		byte bt = (byte)num;
		System.out.print("Byte Conversion is : "+bt);
	}
}