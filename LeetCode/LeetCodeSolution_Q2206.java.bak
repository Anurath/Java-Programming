class LeetCodeSolution_Q2206{
    public boolean divideArray(int[] nums) {
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
                        cnt++;
                        count[j]=-1;
                    }
                }
                if(cnt%2!=0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}