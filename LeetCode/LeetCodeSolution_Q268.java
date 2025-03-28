class LeetCodeSolution_Q268{
    public int missingNumber(int[] nums) {
        for(short i=0;i<=nums.length;i++)
        {
            byte cnt=0;
            for(short j=0;j<nums.length;j++)
            {
                if(i==nums[j])
                {
                    cnt++;
                }
            }
            if(cnt==0)
            {
                return i;
            }
        }
        return 0;
    }
}