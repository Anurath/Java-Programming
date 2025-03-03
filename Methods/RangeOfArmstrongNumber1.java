class RangeOfArmstrongNumber1
{
	public static void main(String[] args)
	{
		for (int i=1;i<=1000;i++)
		{
			if (isArmstrong(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isArmstrong(int num)
	{
		int sum = 0;
		int pow = len(num);
		for (int i=num;i!=0;i/=10)
		{
			sum+=(power((i%10),pow));
		}
		return num==sum;
	}
	public static int power(int num , int pow)
	{
		int op=1;
		for (int i=0;i<pow ;i++)
		{
			op*=num;
		}
		return op;
	}
	public static int len(int num)
	{
		int len = 0;
		for (int i=num;i!=0 ;i/=10 )
		{
			len++;
		}
		return len;
	}
}