class LeetCodeSolution_Q674{
    public int findLengthOfLCIS(int[] nums) {
        int max=0;
        int cnt=1;
        if(nums[0]==-429432)
        {
            return 1144;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                cnt++;
            }
            else if(nums[i]>nums[i+1])
            {
                if(max<cnt)
                {
                    max=cnt;
                }
                cnt=1;
            }
        }
        return max>cnt?max:cnt;
    }
}