class LeetCodeSolution_Q762{
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left;i<=right;i++)
        {
            boolean flag=true;
            int cnt=0;
            for (int j=i;j!=0;j/=2)
		    {
			    if (j%2!=0)
			    {
				    cnt++;
			    }
		    }
            for(int j=2;j<cnt;j++)
            {
                if(cnt%j==0)
                {
                    flag=false;
                    break;
                }
            }
            if(flag&&cnt!=1)
            {
                res++;
            }
        }
    return res;
    }
}