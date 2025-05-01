class LeetCodeSolution_Q1281{
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        int num=0;

        for(int i=n;i!=0;i/=10)
        {
            num=i%10;
            sum+=num;
            pro*=num;
        }
        return pro-sum;
    }
}