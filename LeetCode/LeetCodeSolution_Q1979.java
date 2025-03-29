class LeetCodeSolution_Q1979{
    public int findGCD(int[] nums) {
        int max=0;
        int min=1000;
        int res=1;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
                max=nums[i];
            if(min>nums[i])
                min=nums[i];
        }
        for(int i=min;i>1;i--)
        {
            if(min%i==0&&max%i==0)
            {
                res=i;
                break;
            }
        }
        return res;
    }
}