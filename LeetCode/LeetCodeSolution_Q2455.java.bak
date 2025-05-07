class LeetCodeSolution_Q2455{
    public int averageValue(int[] nums) {
        int cnt = 0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            if(num%2==0&&num%3==0)
            {
                sum+=num;
                cnt++;
            }
        }
        return cnt==0?0:sum/cnt;
    }
}