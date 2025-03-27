class LeetCodeSolution_Q2544{
    public int alternateDigitSum(int n) {
        int sum =0;
		int len = 0;
		int m= 1;
		for (int i=n;i!=0;i/=10)
		{
			len++;
		}
		if(len%2==0)
		{
			m=-1;
		}
		for (int i=n;i!=0;i/=10)
		{
			sum+=(m)*(i%10);
			m=m>0?-1:1;
		}
		return sum;
    }
}