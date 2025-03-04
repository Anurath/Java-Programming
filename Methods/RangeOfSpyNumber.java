class RangeOfSpyNumber
{
	public static void main(String[] args)
	{
		for (int i=1;i<10000 ;i++ )
		{
			if (isSpy(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isSpy(int num)
	{
		int pro = 1;
		int sum = 0;
		for (int i=num;i!=0 ;i/=10 )
		{
			pro*=(i%10);
			sum+=(i%10);
		}
		return sum==pro;
	}
}
