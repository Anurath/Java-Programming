class LeetCodeSolution_Q1822 {
    public int arraySign(int[] nums) {
        byte cntNeg=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                cntNeg++;
            }
            else if(nums[i]==0)
            {
                 return 0;
            }
        }
        return cntNeg%2==0?1:-1;
    }
}