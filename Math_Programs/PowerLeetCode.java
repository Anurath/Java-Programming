class PowerLeetCode
{
	public static void main(String[] args)
	{
		System.out.println(power(0.00001,2147483647));
	}
	public static double power(double x, int n)
	{
		boolean flag = true;
		if(n<0)
		{
			n=n*(-1);
			flag =false;
		}
		double pow=1;
		for (int i=1;i<=n;i++)
		{
			pow*=x;
		}
		return flag?pow:1/pow;
	}
}