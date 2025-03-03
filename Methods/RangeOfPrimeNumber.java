class RangeOfPrimeNumber
{
	public static void main(String[] args)
	{
		for (int i=1;i<100 ;i++ )
		{
			if(isPrime(i))
				System.out.println(i);
		}
	}
	public static boolean isPrime(int num)
	{
		int den=2;
		for (;den<num ;den++ )
		{
			if(num%den==0)
			{
				return false;
			}
		}
		return den==num;
	}
}