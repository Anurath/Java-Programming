class LeetCodeSolution_Q2006{
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				int diff = (nums[i]-nums[j])>0?(nums[i]-nums[j]):(nums[i]-nums[j])*(-1);
				if(diff == k)
				{
					cnt++;
				}
			}
		}
		return cnt;
    }
}