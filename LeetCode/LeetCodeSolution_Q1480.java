class LeetCodeSolution_Q1480{
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        int t=0;
        while(len!=0)
        {
            int run =0;
            for(int i=0;i<=t;i++)
            {
                run+=nums[i];
            }
            arr[t]=run;
			len--;
			t++;
        }
        return arr;
    }
}