class LeetCodeSolution_Q2016{
    public int maximumDifference(int[] nums) {
        int maxDiff = -2146473648;

        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(maxDiff<(nums[j]-nums[i]) && (nums[j]-nums[i])>0 )
                {
                    maxDiff = (nums[j]-nums[i]);
                }
            }
        }
        return maxDiff!=-2146473648?maxDiff:-1;
    }
}