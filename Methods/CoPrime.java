class CoPrime
{
	public static void main(String[] args)
	{
		System.out.println(isCoPrime(14,23));
	}
	public static boolean isCoPrime(int n1,int n2)
	{
		return hcf(n1,n2)==1;
	}
	public static int hcf(int n1, int n2)
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
