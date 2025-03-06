class XylemandPhloemNumber
{
	public static void main(String[] args)
	{
		int cnt=0;
		for (int i=10;i<100000;i++ )
			if (isXP(i))
				cnt++;
		System.out.println(cnt);
	}
	public static int divisor(int num)
	{
		int div=1;
		for (int i =num;i!=0 ;i/=10 )
			div*=10;
		return (div/10);
	}
	public static boolean isXP(int num)
	{
		int lNum = num%10;
		num/=10;
		int div = divisor(num);
		int fNum = num/div;
		int sum = 0;
		for (int i=num;i!=fNum ;i/=10 )
			sum+=(i%10);
		if(sum==(fNum+lNum))
			return true;
		else
			return false;
	}
	
}