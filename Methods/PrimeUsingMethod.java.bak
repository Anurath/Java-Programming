import java.util.Scanner;
class PrimeUsingMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the num : ");
		int num = sc.nextInt();
		prime(num);
	}
	public static void prime(int num)
	{
		boolean flag = true;
		if (num==1)
		{
			flag = false;
			break;
		}
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("The given number is Prime number.");
		else
			System.out.println("The given number is not Prime number.");
	}
}