class LCM
{
	public static void main(String[] args)
	{
		System.out.println(lcm(12,10));
	}
	public static int lcm(int n1, int n2)
	{
		int max = n1>n2?n1:n2;
		int cnt = 1;
		while (true)
		{
			if(max*(cnt)%n1==0&&max*(cnt)%n2==0)
			{
				return max*(cnt);
			}
			cnt++;
		}
	}
}