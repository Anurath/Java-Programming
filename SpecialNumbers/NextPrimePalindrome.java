class NextPrimePalindrome
{
	public static void main(String[] args)
	{
		System.out.println(nextPalindrome(2));
	}
	public static int nextPalindrome(int num)
	{
		int newNum = nextPrime(num);
		while (true)
		{
			if (isPalindrome(newNum))
			{
				return newNum;
			}
			else
			{
				newNum=nextPrime(newNum);
			}
		}
	}
	public static boolean isPalindrome(int num)
	{
		int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+(i%10);
		}
		return rev==num;
	}
	public static int nextPrime(int num)
	{
		if (num==2)
		{
			return num;
		}
		for (int i=2;i<num;i++ )
		{
			System.out.println("somtheonglasknf;");
			if (num%i==0)
			{
				num++;
				i=2;
			}
		}
		return num;
	}
}