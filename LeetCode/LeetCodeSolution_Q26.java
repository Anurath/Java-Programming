class  LeetCodeSolution_Q26
{
	public static void main(String[] args) 
	{
		int[] nums = {1,2,3,2,3};
		uniqueCount(nums);
	}
	public static void uniqueCount(int[] nums)
	{
		int cnt=0;
		for (int i=0;i<nums.length;i++ )
		{
			for (int j=i+1;j<nums.length;j++)
			{
				if (nums[i]==nums[j])
				{
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
