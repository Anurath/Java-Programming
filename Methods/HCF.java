class HCF
{
	public static void main(String[] args)
	{
		System.out.println(hcf(20,15));
	}
	public static int hcf(int n1,int n2)
	{
		int min = n1>n2?n2:n1;
		while (true)
		{
			if (n1%min==0&&n2%min==0)
			{
				return min;
			}
			min--;
		}
	}
}