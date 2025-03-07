class PythagorusTriplets
{
	public static void main(String[] args)
	{
		System.out.println(isTriplets(3,4,5));
	}
	public static boolean isTriplets(int n1,int n2,int n3)
	{
		int newNum = n1*n1+n2*n2;
		if (newNum==n3*n3)
		{
			return true;
		}
		return false;
	}
}