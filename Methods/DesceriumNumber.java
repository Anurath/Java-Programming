class DesceriumNumber 
{
	public static void main(String[] args) 
	{
		System.out.println(isDesceriumNumber(175));
	}
	public static boolean isDesceriumNumber(int num)
	{
		int sum = 0;
		int len = len(num);
		for (int i=num;i!=0;i/=10)
		{
			sum+=power((i%10),len);
			len--;
		}
		System.out.println(num+" "+sum);
		return num==sum;
	}
	public static int power(int base, int raise)
	{
		int pow = 1;
		for (int i=raise;i>0;i--)
		{
			pow*=base;
		}
		return pow;
	}
	public static int len(int num)
	{
		int cnt=0;
		while(num!=0)
		{
			cnt++;
			num/=10;
		}
		return cnt;
	}
}
