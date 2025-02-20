class Pattern02
{
	public static void main(String[] args)
	{
		int num = 4;
		for (int i=1;i<=num ;i++ )
		{
			int cnt = 3;
			int temp=i;
			for (int j=1;j<=i;j++ )
			{
				System.out.print(temp+" ");
				temp+=cnt;
				cnt--;
			}
			System.out.println();
		}
	}
}
