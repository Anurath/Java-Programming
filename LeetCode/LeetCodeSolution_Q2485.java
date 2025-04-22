class LeetCodeSolution_Q2485{
    public int pivotInteger(int n) {
        int piv=1;
        int temp=n;
        while(temp!=0)
        {
            int sum1 = 0;
            int sum2 = 0;
            for(int i=1;i<=piv;i++)
            {
                sum1+=i;
            }
            int j=piv;
			int res=j;
            for(;j<=n;j++)
            {
                sum2+=j;
            }
            if(sum1 == sum2)
            {
                return res;
            }
			piv++;
			temp--;
        }
        return -1;
    }
}