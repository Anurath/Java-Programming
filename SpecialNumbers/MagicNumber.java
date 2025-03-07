class MagicNumber
{
	public static void main(String[] args)
	{
		System.out.println(isMagic(29));
	}
	public static boolean isMagic(int num)
	{
		int sum=digitSum(num);
		for (; ; )
		{
			
			if (sum>9)
			{
				sum=digitSum(sum);
				continue;
			}
			else if(sum==1)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
	}
	public static int digitSum(int num)
	{
		int sum =0;
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=(i%10);
		}
		return sum;
	}
}