import java.util.Scanner;
class MakePrimeMethod
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		makePrime(num);

	}
	public static void makePrime(int num)
	{
		for (; ;num++)
		{
			boolean flag = true;
			for (int i=2;i<num ;i++ )
				if (num%i==0)
				{
					flag = false;
					break;
				}
			if (flag)
			{
				System.out.println(num);
				break;
			}
		}
	}
}