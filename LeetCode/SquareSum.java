class SquareSum
{
	public static void main(String[] args)
	{
		System.out.println(isSquareSum(5));
	}
	public static boolean isSquareSum(int num)
	{
		for (int i=1;i<num;i++)
		{
			for (int j=1;j<num;j++ )
			{
				if(j*j+i*i==num)
				{
					System.out.println(i+"  "+j);
					return true;
				}
			}
			return false;
		}
	}
}