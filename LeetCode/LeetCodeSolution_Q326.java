class LeetCodeSolution_Q326{
	//Q.326
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        for(;n!=1;n/=3)
            if(n%3!=0)
				return false;
        return n!=1?false:true;
    }
}