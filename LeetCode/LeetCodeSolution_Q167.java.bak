class LeetCodeSolution_Q167{
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1,k=numbers.length-1;j<=k;j++,k--)
			{
				if(numbers[j]+numbers[i]==target)
				{
					ans[0]=i+1;
					ans[1]=j+1;
                    return ans;
				}
				if(numbers[k]+numbers[i]==target)
				{
					ans[0]=i+1;
					ans[1]=k+1;
                    return ans;
				}
			}
		}
        return ans;
    }
}