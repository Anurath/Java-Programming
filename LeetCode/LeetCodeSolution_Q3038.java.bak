class LeetCodeSolution_Q3038{
    public int maxOperations(int[] nums) {
       int[] ans = new int[nums.length/2];

        for(int i=0,k=0;k<ans.length;i+=2)
        {
            ans[k++]=nums[i]+nums[i+1];
        }

		int ref = ans[0],cnt=0;
		for(int i=0;i<ans.length;i++)
		{
			if(ans[i]==ref)
			{
				cnt++;
			}
			else{
				break;
			}
		}
		return cnt;
    }
}