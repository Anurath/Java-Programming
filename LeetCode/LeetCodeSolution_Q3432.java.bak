class LeetCodeSolution_Q3432{
    public int countPartitions(int[] nums) {
        byte cnt=0;
        for(byte i=0;i<nums.length-1;i++)
        {
            short leftSum=0;
            short rightSum=0;
            for(byte j=0;j<=i;j++)
            {
                leftSum+=nums[j];
            }
            for(int j=i+1;j<nums.length;j++)
            {
                rightSum+=nums[j];
            }
            if((leftSum-rightSum)%2==0)
            {
                cnt++;
            }
        }
        return cnt;
    }
}