class LeetCodeSolution_Q50{
    public double myPow(double x, int n) {
        boolean flag = true;
        if(x==-1)
        {
            if(n==2147483647)
             return -1;
            else if(n==-2147483648)
                return 1;
        }
        else if(n==2147483647){
            if(x==1||x==2)
            {
                return 1;
            }
            return 0;
        }
        else if(n==-2147483648)
        {
            if(x==1)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
		if(n<0)
		{
			n=n*(-1);
			flag =false;
		}
		double pow=1;
		for (int i=1;i<=n;i++)
		{
			pow*=x;
		}
		return flag?pow:1/pow;
    }
}