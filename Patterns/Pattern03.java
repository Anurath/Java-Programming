class Pattern03
{
	public static void main(String[] args)
	{
		int num = 5;
		int evenDiff = 9;
		int oddDiff = -2;
		for (int i=1;i<=num ;i++ )
		{
			int cnt=i;
			for (int j=1;j<=i ;j++ )
			{
				if (j==1)
					System.out.print(cnt+ " ");
				else
				{
					if (j%2==0)
						System.out.print((cnt+=evenDiff)+" ");
					else if(j<5)
						System.out.print((cnt+=oddDiff)+" ");
					else
						System.out.print(cnt+(j/2));
				}
			}
			evenDiff-=2;
			oddDiff+=2;
			System.out.println();
		}
	}
}
