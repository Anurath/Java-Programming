class LeetCodeSolution_Q2535{
    public int differenceOfSum(int[] nums) {
        int digSum=0;
		int eleSum=0;
		for (int i=0;i<nums.length;i++)
		{
			int num=nums[i];
			eleSum+=num;
			int tempSum=0;
			for (int j=num;j!=0;j/=10)
			{
				tempSum+=(j%10);
			}
			digSum+=tempSum;
		}
		return eleSum-digSum;
    }
}