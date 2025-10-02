class LeetCodeSolution_Q3046 {
    public boolean isPossibleToSplit(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int cnt =0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
            if(cnt>2)
            {
                return false;
            }
        }
        return true;
    }
}