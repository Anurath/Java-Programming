class LeetCodeSolution_Q55{
    public boolean canJump(int[] nums) {
       int len = nums.length;
	   int i=0;
       if(len==1)
        {
            return true;
        }
        for(;i<len;i++)
        {
           if(nums[i]!=0)
           {
            i = nums[i]+i;
           }
           else
           {
            return false;
           }
        }
		return i<=len;
    }
}