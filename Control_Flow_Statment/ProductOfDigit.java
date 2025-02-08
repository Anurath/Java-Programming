import java.util.Scanner;
class ProductOfDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int pro = 1;

		while (num>0)
		{
			int rem = num%10;
			pro*=rem;
			num/=10;
		}
		System.out.println("The product of the all digits is : "+pro);
	}
}