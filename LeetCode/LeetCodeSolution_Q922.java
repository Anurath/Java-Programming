class LeetCodeSolution_Q922{
    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int eCnt=0,oCnt=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                ans[eCnt]=nums[i];
                eCnt+=2;
            }
            else{
                ans[oCnt]=nums[i];
                oCnt+=2;
            }
        }
        return ans;
    }
}