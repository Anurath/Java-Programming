class LeetCodeSolution_Q3300{
    public int minElement(int[] nums) {
        int min=36;
		for (int i=0;i<nums.length;i++)
		{
			int sum=0;
			for (int j=nums[i];j!=0 ;j/=10)
				sum+=(j%10);
			if (sum<min)
				min=sum;
		}
		return min;
    }
}