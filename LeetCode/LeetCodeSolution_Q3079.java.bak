class LeetCodeSolution_Q3079{
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=encrypt(nums[i]);
		}
		return sum;
	}
    public static int encrypt(int num)
    {
        int cnt = 0;
        int max = 0;
        while(num!=0)
        {
            if(max<=num%10)
            {
                max = num%10;
            }
			num/=10;
			cnt++;
        }
		int numAns = max;
        while(cnt!=1)
		{
			numAns=(numAns*10)+max;
			cnt--;
		}
		return numAns;
    }
}