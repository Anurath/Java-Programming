class LeetCodeSolution_Q1137{
    public int tribonacci(int n) {
        int t0=0,t1=1,t2=1;
		if(n==0)
		{
			return t0;
		}
		else if(n==1)
		{
			return t1;
		}
		else if(n==2)
		{
			return t2;
		}
        for(byte i=2;i<n;i++)
        {
			int temp1=t2;
			int temp2=t1;
			t2=t2+t1+t0;
			t1=temp1;
			t0=temp2;
        }
		return t2;
    }
}