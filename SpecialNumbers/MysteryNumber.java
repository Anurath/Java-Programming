class MysteryNumber
{
	public static void main(String[] args)
	{
		for (int i=1;i<10000 ;i++ )
		{
			if (isMystery(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isMystery(int num)
	{
		for (int i=1;i<num ;i++ )
		{
			if (add(i)==num)
			{
				System.out.print(i+ " ");
				return true;
			}
		}
		return false;
	}
	public static int add(int num)
	{
		return num+rev(num);
	}
	public static int rev(int num)
	{
		int rev=0;
		for (int i=num;i!=0 ;i/=10 )
		{
			rev=rev*10+(i%10);
		}
		return rev;
	}
}