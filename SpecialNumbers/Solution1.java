class  Solution1
{
	public static void main(String[] args) 
	{
		int num =5;
		int n1=7;
		int cnt = 1;
		int newN=0;
		for (int i=1;i<num ;i++ )
		{
			for (int j=1;j<num ;j++ )
			{
				if (j==1)
				{
					System.out.print(i + " ");
				}
				else if(j%2!=0)
				{
					newN= i+n1;
					System.out.print(newN+ " ");
					n1-=2;
				}
				else if(j%2==0)
				{
					newN+=cnt;
					System.out.print(newN+ " ");
					cnt+=2;
				}
			}
			System.out.println();
			cnt=1;
			newN=0;
			n1=7;
		}
	}
}
