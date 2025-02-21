class Pattern1
{
	public static void main(String[] args)
	{
		int num = 4;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			System.out.println();
			int n1=1;
		    for (int j=0;j<=i ;j++ )
			{
				System.out.print(n1++);
		    }
			System.out.println();
		}
	}
}