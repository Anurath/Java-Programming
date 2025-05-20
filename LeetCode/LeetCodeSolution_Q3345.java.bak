class LeetCodeSolution_Q3345{
    public int smallestNumber(int n, int t) {
        int res=0;
		while(true)
		{
			int pro=1;
			for (int i=n;i!=0;i/=10 )
			{
				pro*=(i%10);
			}
			if (pro%t==0)
			{
				res=n;
				break;
			}
			n++;
		}
		return res;
    }
}