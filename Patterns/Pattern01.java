class Pattern1
{
	public static void main(String[] args)
	{
		int num = 4;
		int cnt=2;
		for (int i=1;i<=num ;i++ )
		{
			int temp = cnt;
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(--cnt +" ");
			}
			cnt+=(temp+i);
			System.out.println();
		}
	}
}