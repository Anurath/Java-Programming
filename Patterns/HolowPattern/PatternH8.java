class PatternH8
{
	public static void main(String[] args)
	{
		int num = 13;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<num ;j++ )
			{
				if (i==0||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for (int j=1;j<num ;j++ )
			{
				if(i==0||j+i==num-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}