class LeetCodeSolution_Q1929{
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        for(int i=0,j=nums.length,k=0;k<nums.length;k++,i++)
        {
                ans[k] = nums[i];
                ans[j++]=nums[i];
        }

        return ans;
    }
}