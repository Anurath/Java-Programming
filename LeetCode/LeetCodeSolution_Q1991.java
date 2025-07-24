class LeetCodeSolution_Q1991{
    public int findMiddleIndex(int[] nums) {
        int lSum =0,rSum=0;
        for(int j=0,k=0;j<nums.length;j++,k++)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(i<k)
                {
                   lSum+=nums[i];
                }
                else if(i>k)
                {
                    rSum+=nums[i];
                }
            }
			if(lSum==rSum)
			{
				return k;
			}
			else
			{
				lSum=0;
				rSum=0;
			} 
        }
		return -1;
    }
}