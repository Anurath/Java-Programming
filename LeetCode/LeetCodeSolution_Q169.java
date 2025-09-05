class LeetCodeSolution_Q169 {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
			int cnt = 1;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
                if(cnt>=nums.length/2.0)
                {
                    return nums[i];
                }
            }
        }
		return nums[0];
    }
}
