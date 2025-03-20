class Test 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<1000;i++ )
		{
			if (PalindromeMethod.isPrime(i))
			{
				if (PalindromeMethod.isPalindrome(i))
				{
					System.out.println(i);
				}
			}
		}
	}
}
