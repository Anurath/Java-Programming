class LeetCodeSolution_Q3622 {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int pro = 1;
        int temp=n;
        while(n!=0)
        {
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        return temp%(sum+pro)==0;
    }
}