class LeetCodeSolution_Q2733{
    public int findNonMinOrMax(int[] nums) {
        int max = -2146473648,min = 2146473647;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
            if(nums[i]<min)
            {
                min = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=min && nums[i]!=max)
            {
                return nums[i];
            }
        }
        return -1;
    }
}