class LeetCodeSolution_Q896{
    public boolean isMonotonic(int[] nums) {
        int incCnt=0,decCnt=incCnt;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                incCnt++;
            }
            else if(nums[i]>nums[i+1])
            {
                decCnt++;
            }
            if(incCnt>0&&decCnt>0)
            {
                return  false;
            }
        }

        if(incCnt==0|| decCnt==0)
        {
            return true;
        }
        return false;
    }
}