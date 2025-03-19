class Strobogrammaticnumber
{
	public static void main(String[] args)
	{
		System.out.println(rev(1234));
	}
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i!=0;i/=10)
		{
			rev=rev*10+(i%10);
		}
		return rev;
	}
}