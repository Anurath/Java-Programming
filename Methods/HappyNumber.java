class HappyNumber
{
	public static void main(String[] args)
	{
		System.out.println(isHappy(10));
	}
	public static boolean isHappy(int num)
	{
		for (; ; )
		{
			if (digitSum(num)==4)
				return false;
			else if(digitSum(num)==1)
				return true;
			num=digitSum(num);
		}
	}
	public static int digitSum(int num)
	{
		int sum=0;
		for (int i=num ; i!=0;i/=10 )
			sum+=(i%10);
		return sum;
	}
}