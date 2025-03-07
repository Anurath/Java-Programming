class SmithNumber
{
	public static void main(String[] args)
	{
		for (int i=2;i<10000;i++ )
		{
			if (!isPrime(i))
			{
				if (isSmith(i))
				{
					System.out.println(i);
				}
			}
		}
	}
	public static boolean isSmith(int num)
	{
		int digitSum =sumDigit(num);
		int factSum = 0;
		int div=2;

		for (int i=num;i!=1; )
		{
			if (i%div==0)
			{
				i/=div;
				if (div<10)
				{
					factSum+=div;
				}
				else
				{
					factSum+=sumDigit(div);
				}
				div=2;
			}
			else
			{
				div=nextPrime(div);
			}
		}
		return factSum==digitSum ;
	}
	public static int nextPrime(int num)
	{
		int den = 2;
		num+=1;
		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				num++;
				den=2;
			}
		}
		return num;
	}
	public static boolean isPrime(int num)
	{
		int den = 2;
		for (;den<num ;den++ )
		{
			if (num%den==0)
			{
				return false;
			}
		}
		return true;
	}
	public static int sumDigit(int num)
	{
		int sum = 0;
		for (int i=num ;i!=0 ;i/=10 )
		{
			sum+=(i%10);
		}
		return sum;
	}
}