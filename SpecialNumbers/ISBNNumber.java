class ISBNNumber
{
	public static void main(String[] args)
	{
		int num= 1503290565;
		int sum =0;
		for (int i=num ,j=1;i>0 ;i/=10,j++ )
		{
			int rem = i%10;
			sum+=(rem*j);
		}
		if (sum%11==0)
		{
			System.out.println("The given number is ISBN number.");
		}
		else
		{
			System.out.println("The given number is not ISBN number.");
		}
	}
}