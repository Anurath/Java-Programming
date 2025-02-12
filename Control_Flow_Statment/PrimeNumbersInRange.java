import java.util.Scanner;
class PrimeNumbersInRange
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number : ");
		int startNum = sc.nextInt();
		System.out.print("Enter the Second Number : ");
		int endNum = sc.nextInt();
		for (int i=startNum;i<=endNum ;i++ )
		{
			boolean flag = true ;
			if (i==1)
			{
				flag= false;
				continue;
			}
			for (int j=2;j<i ;j++ )
				if (i%j==0)
				{
					flag= false;
					break;
				}
			if (flag)
				System.out.println(i);
		}
	}
}