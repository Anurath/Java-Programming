class LeetCodeSolution_Q3115 {
    public int maximumPrimeDifference(int[] nums) {
        int s = -1;
        int e = -1;
        boolean flag1 = true;
        boolean flag2 = true;
        for(int i=0,j=nums.length-1;i<nums.length && j>=0;i++,j--)
        {
            if(isPrime(nums[i]) && flag1)
            {
                s = i;
                flag1 = false;
            }
            if(isPrime(nums[j]) && flag2)
            {
                e =j;
                flag2 = false;
            }
            
        }
        if(e==-1||s==-1)
			return 0;
        return e-s;
    }
    public boolean isPrime(int num)
    {
        if(num==2)
        {
            return true;
        }
        else if(num==1)
        {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }
}