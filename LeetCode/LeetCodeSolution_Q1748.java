class LeetCodeSolution_Q1748{
    public int sumOfUnique(int[] nums) {
        int[] freq = new int[nums.length];
        int sum = 0;
        for(byte i=0;i<nums.length;i++)
        {
            if(freq[i]!=-1)
            {
                int cnt = 0;
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]==nums[j])
                    {
                        cnt++;
                        freq[j]=-1;
                    }
                }
                if(cnt==0)
                {
                    sum+=nums[i];
                }
            }
        }
		return sum;
    }
}