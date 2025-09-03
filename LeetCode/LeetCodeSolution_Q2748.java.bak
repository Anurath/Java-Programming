class LeetCodeSolution_Q2748{
    public int countBeautifulPairs(int[] nums) {
        int res = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int num1 = nums[i];
                int num2 = nums[j];
                int fNum = num1*10/div(num1);
                int lNum=nums[j]%10;
				System.out.println("F Num: "+fNum+" "+"lNum: "+lNum);
                if(isCoprime(fNum,lNum))
                {
                    res++;
                }
            }
        }
        return res;
    }
    public static boolean isCoprime(int n1,int n2)
    {
        int max = n1>n2?n1:n2;
        int min = n1<n2?n1:n2;
        int cnt=0;
        for(int i=1;i<=min;i++)
        {
            if(max%i==0&&min%i==0)
            {
                cnt++;
            }
        }
        return cnt==1;
    }
    public static int div(int num)
    {
        int cnt=1;
        for(int i=num;i!=0;i/=10)
        {
            cnt*=10;
        }
        return cnt;
    }
}