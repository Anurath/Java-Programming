class RangeOfNeonNumber
{
	public static void main(String[] args)
	{
		for (int i=1;i<=1000000;i++ )
		{
			if (isNeon(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isNeon(int num)
	{
		int sqr = square(num);
		int sum = digitSum(sqr);
		return num==sum;
	}
	public static int square(int num)
	{
		int sqr = num*num;
		return sqr;
	}
	public static int digitSum(int num)
	{
		int sum = 0;
		for (int i=num;i!=0 ;i/=10 )
		{
			sum+=(i%10);
		}
		return sum;
	}
}