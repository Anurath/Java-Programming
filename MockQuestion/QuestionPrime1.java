import java.util.Scanner;
class QuestionPrime1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		for (int i=2;i<=num ;i++ )
		{
			boolean flag = true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				boolean flag2= true;
				for (int j=i;j>0 ;j/=10 )
				{
					int rem = j%10;
					if (rem==1)
					{
						flag2 = false;
						break;
					}
					for (int k=2;k<rem ;k++ )
					{
						if (rem%k==0)
						{
							flag2 = false;
							break;
						}
					}
					if (!flag2)
					{
						break;
					}
				}
				if (flag2)
				{
					System.out.println(i);
				}
			}
		}
	}
}