import java.util.Scanner;
class PrimeFactorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		boolean flag=true;
		int num = sc.nextInt();

		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				for (int j=2;j<i-1 ;j++ )
				{
					if (i%j==0)
					{
						System.out.println("This number is not prime number.");
						flag=false;
						break;
					}
				}
			}
		}
		if (flag)
		{
			System.out.println("This number is a prime number.");
		}
	}
}