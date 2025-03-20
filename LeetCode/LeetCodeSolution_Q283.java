class  LeetCodeSolution_Q283
{
	public static void main(String[] args) 
	{
		int[] nums = {0,3,0,1,2,3,2,0,1,3};
		uniqueCount(nums);
	}
	public static void uniqueCount(int[] nums)
	{
		int j=0;
		int[] arr = new int[nums.length];

		for (int i=0;i<nums.length;i++ )
		{
			if(nums[i]!=0)
			{
				arr[j]=nums[i];
				j++;
			}
		}
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println(arr[i]);
		}
	}
}
