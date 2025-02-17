class  Pattern10
{
	public static void main(String[] args) 
	{
		int num = 4;
		char ch = 'a';
		int n=1;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<=i ;j++ )
			{
				if (i%2==0)
				{
					System.out.print(n++ + " ");
				}
				else
				{
					System.out.print(ch++ +" ");
				}
			}
			System.out.println();
		}
	}
}
