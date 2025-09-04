class LeetCodeSolution_Q3005{
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(count[i]!=-1)
            {
                int cnt=1;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        count[j]=-1;
                        cnt++;
                    }
                }
                count[i]=cnt;
            }
        }
        int max=-2147483648;
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>max)
            {
                max=count[i];
            }
        }
        int res=0;
        for(int j=0;j<count.length;j++)
        {
            if(count[j]==max)
            {
                res+=max;
            }
        }
        return res;
    }
}