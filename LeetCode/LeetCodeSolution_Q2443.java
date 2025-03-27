class LeetCodeSolution_Q2443{
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++)
        {
            int rev=0;
            for(int j=i;j!=0;j/=10)
                rev=rev*10+(j%10);
            if(rev+i==num)
                return true;
        }
        return false;
        
    }
}