class LeetCodeSolution_Q3467{
    public int[] transformArray(int[] nums) {
        int len=nums.length-1;
        int inCnt=0;
        int[] res=new int[len+1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            {
                res[inCnt]=0;
                inCnt++;
            }
            else
            {
                res[len]=1;
                len--;
            }
        }
        return res;
    }
}