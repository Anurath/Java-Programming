class RecPalindrome
{
	public static void main(String[] args)
	{
		for (int i=0;i<1000;i++ )
		{
			if(palindrome(i,i,0))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean palindrome(int num,int temp,int rev)
	{
		if(num==0)
		{
			return temp==rev;
		}
		rev = rev*10+(num%10);
		return palindrome(num/10,temp,rev);
	}
}