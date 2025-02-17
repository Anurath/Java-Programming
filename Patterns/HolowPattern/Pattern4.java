class  Pattern4
{
	public static void main(String[] args) 
	{
		int num=5;
		int cnt = 1;
		for (int i=0;i<num ;i++ )
		{
			for (int j=0;j<i ;j++ )
			{
				System.out.print(cnt++ +" ");
			}
			System.out.println();
		}
	}
}
