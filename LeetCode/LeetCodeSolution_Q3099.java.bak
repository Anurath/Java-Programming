class LeetCodeSolution_Q3099{
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        byte sum = 0;
        for(int i=x;i!=0;i/=10)
            sum+=(i%10);
        if(x%sum==0)
            return sum;
        return -1;
    }
}