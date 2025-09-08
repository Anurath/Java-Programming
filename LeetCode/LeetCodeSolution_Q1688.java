class LeetCodeSolution_Q1688 {
    public int numberOfMatches(int n) {
        if(n==1)
        {
            return 0;
        }
        int matchCount=0;
        while(n!=2)
        {
            matchCount+=(n/2);
            n=(n/2)+(n%2);
        }
        return matchCount+1;
    }
}