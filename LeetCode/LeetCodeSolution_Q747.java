class LeetCodeSolution_Q747{
    public int dominantIndex(int[] nums) {
        int max = -214483648,idx=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                idx=i;
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]*2>max&&i!=idx)
            {
                return -1;
            }
        }
        return idx;
    }
}