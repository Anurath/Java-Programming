class LeetCodeSolution_Q2404{
    public int mostFrequentEven(int[] nums) {
        int res=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            int n=nums[i];
            if(n%2==0)
            {
                int cnt=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]==n)
                    {
                        cnt++;
                    }
                }
                if(res<cnt)
                {
                    res=cnt;
                    max=n;
                }
                else if(res==cnt)
                {
                    max=max<n?max:n;
                }
            }
        }
        if(max==0 && res!=0)
        {
            return 0;
        }
       return max>0?max:-1;
    }
}