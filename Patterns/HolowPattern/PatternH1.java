class PatternH1
{
	public static void main(String[] args)
	{
		int num = 10;
		for (int i=0 ;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (j==0||i==j||i==num-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}