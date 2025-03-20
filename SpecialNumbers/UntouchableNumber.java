class UntouchableNumber
{
	public static void main(String[] args)
	{
		System.out.println(isUntouchableNumber(20));
	}
	public static boolean isUntouchableNumber(int num)
	{
		int factSum=factSum(num);
		if (num==factSum)
		{
			return false;
		}
		else if (factSum<num)
		{
			return true;
		}
		else
		{
			return check(num,factSum);
		}
	}

	public static boolean check(int num,int sum)
	{
		for (int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				if (num==sum-i)
				{
					return false;
				}
			}
		}
		return true;
	}

	public static int factSum(int num)
	{
		int sum = 0;
		for (int i=1;i<=num/2;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		return sum;
	}
}