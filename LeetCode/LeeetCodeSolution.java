class LeeetCodeSolution
{
	//Q.
	public static void main(String[] args)
	{
		System.out.println(nextPrimePalindrome(23));
	}
	public static int nextPrimePalindrome(int num)
	{
		for (; ; )
		{
			int nextPrime = nextPrime(num);
			if (isPalindrome(nextPrime))
			{
				return nextPrime;
			}
		}
	}
	public static boolean isPalindrome(int num)
	{
		int rev =0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+(i%10);
		}
		return rev==num;
	}
	public static int nextPrime(int n)
	{
		int i=2;
		for (;i<n ;i++ )
		{
			if(n%i==0)
			{
				n++;
				i=2;
			}
		}
		return i;
	}
}

