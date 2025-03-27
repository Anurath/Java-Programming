class LeetCodeSolution_Q2180{
    public int countEven(int num) {
        int cnt=0;
        for(int i=1;i<=num;i++)
        {
            int sum=0;
            for(int j=i;j!=0;j/=10)
                sum+=(j%10);
            if(sum%2==0)
                cnt++;
        }
        return cnt;
    }
}