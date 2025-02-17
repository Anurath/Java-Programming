class  Pattern7
{
	public static void main(String[] args) 
	{
		int num = 4;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				if ((i+j)%2==0)
				{
					System.out.print('1'+" ");
				}
				else
				{
					System.out.print('0'+ " "  );
				}
			}
			System.out.println();
		}
	}
}
