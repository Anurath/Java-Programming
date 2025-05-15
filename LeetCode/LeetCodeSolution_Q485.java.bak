class LeetCodeSolution_Q485{
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int iCnt=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                iCnt++;
            }
            else
            {
                if(max<iCnt)
                {
                    max=iCnt;
                }
                iCnt=0;
            }
        }
    return max=max<iCnt?max=iCnt:max;
    }
}