import java.util.Scanner;
class CountOfGoodPrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number : ");
		int startNum = sc.nextInt();
		System.out.print("Enter the Last Number : ");
		int count=0;
		int endNum = sc.nextInt();
		for (int i=startNum;i<=endNum;i++ )
		{
			boolean flag=true;
			if (i==1)
			{
				flag = false;
			}
			for (int j=2;j<i;j++ )
			{
				if (i%j==0)
				{
					flag=false;
					break;
				}
			}
			if (flag)
			{
				boolean flag1=true;
				for (int j=i;j>0 ;j/=10)
				{
					int rem = j%10;
					if (rem==1)
					{
						flag1= false;
						break;
					}
					for (int k=2;k<rem ;k++ )
					{
						if (rem%k==0)
						{
							flag1=false;
							break;
						}
					}
				}
				if (flag1)
				{
					count++;
				}
			}
		}
		System.out.print(count);
	}
}