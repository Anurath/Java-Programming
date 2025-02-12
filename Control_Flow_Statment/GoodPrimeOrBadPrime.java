import java.util.Scanner;
class GoodPrimeOrBadPrime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		boolean flag= true;
		for (int i=2;i<num ;i++ )
		{
			if (num%i==0)
			{
				flag = false;
				break;
			}
		}
		if (flag)
		{
			boolean flag1= true;
			for (int i=num;i>0 ;i/=10 )
			{
				int rem=i%10;
				if (rem==1)
				{
					flag1=false;
					break;
				}
				else
				{
					for (int j=2;j<rem ;j++ )
				    {
					  if (rem%j==0)
					  {
						flag1 = false;
						break;
					  }
				    }
				}
			}
			if (flag1)
			{
				System.out.println("This number is Good Prime number");
			}
			else
			{
				System.out.println("This is not good prime number.");
			}
		}
		else
		{
			System.out.println("The given number is not prime.");
		}
	}
}