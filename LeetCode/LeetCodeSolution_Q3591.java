class LeetCodeSolution_Q3591{
    public boolean checkPrimeFrequency(int[] nums) {
        int[] ref = new int[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			if(ref[i]!=-1)
			{
				int cnt=1;
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[i]==nums[j])
					{
						ref[j]=-1;
						cnt++;
					}
				}
				ref[i]=cnt;
			}
		}

		for(int i=0;i<ref.length;i++)
		{
			if(isPrime(ref[i]))
            {
                return true;
            }
		}
		return false;
    }

	public static boolean isPrime(int num)
	{
		if(num==1||num==-1)
			return false;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
