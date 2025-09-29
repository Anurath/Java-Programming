class LeetCodeSolution_Q1848{
    public int getMinDistance(int[] nums, int target, int start) {
        int idx = 0;
        int min = 2147483647;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                int temp = (i-start);
                if(temp<0)
                {
                    temp*=(-1);
                }
                if(temp<min)
                {
                    min = temp;
                }
            }
        }

        return min;
    }
}