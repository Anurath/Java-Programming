class LeetCodeSolution_Q367{
    public boolean isPerfectSquare(int num) {
        boolean flag=false;
        if(num==1)
        {
            return true;
        }
        for(int i=1;i<=num/2;i++)
        {
            if(i*i==num)
            {
                flag = true;
                break;
            }
            if(i*i>num)
            {
                break;
            }
        }
        return flag;
    }
}