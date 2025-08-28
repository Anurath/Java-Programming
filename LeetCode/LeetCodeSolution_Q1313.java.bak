class LeetCodeSolution_Q1313{
    public int[] decompressRLElist(int[] nums) {
        int max = 0;
		for(int i=0;i<nums.length;i+=2)
		{
			max+=nums[i];
		}

		int[] ans = new int[max];
		int idx=0;
		for(int i=0;i<nums.length;i+=2)
		{
			for(int j=0;j<nums[i];j++)
			{
				ans[idx++] = nums[i+1];
			}
		}
		return ans;
    }
}