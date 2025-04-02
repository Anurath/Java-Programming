class LeetCodeSolution_Q3151{
    public boolean isArraySpecial(int[] nums) {
        boolean flag = true;
		for(int i=0;i<nums.length-1;i++)
		{
			boolean flag1=false;
			boolean flag2=false;
			if(nums[i]%2==0)
			{
				flag1=true;
			}
			if(nums[i+1]%2==0)
			{
				flag2=true;
			}
			if(flag1==flag2)
			{
				return false;
			}
		}
		return true;
    }
}