class LeetCodeSolution_Q2481{
	//Q 2481
    public int numberOfCuts(int n) {
        if(n==1)
            return 0;
        return n%2==0?n/2:n;
    }
}