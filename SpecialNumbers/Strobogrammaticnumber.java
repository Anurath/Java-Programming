class Strobogrammaticnumber
{
	public static void main(String[] args)
	{
		for (int i=10;i<100;i++ )
		{
			if (isStrobogrammaticNumber(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isStrobogrammaticNumber(int num)
	{
		int rev = rev(num);
		for (int i=num;i!=0;i/=10)
		{
			int last1=num%10;
			int last2=rev%10;
			if (!(last1==1&&last2==1||last1==0&&last2==0||last1==8&&last2==8||last1==9&&last2==6||last1==6&&last2==9))
			{
				return false;
			}
		}
		return true;
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