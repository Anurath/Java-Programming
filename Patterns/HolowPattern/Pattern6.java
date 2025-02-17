class  Pattern6
{
	public static void main(String[] args) 
	{
		char ch = 'a';
		int num = 4;
		for (int i=0;i<num ;i++ )
		{
			for (int j =0;j<=i ;j++ )
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
	}
}
