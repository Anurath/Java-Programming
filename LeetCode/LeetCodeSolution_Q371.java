class LeetCodeSolution_Q371{
    public int getSum(int a, int b) {
        int max=a>b?a:b;
        int min=a>b?b:a;
        if(a<0&&b<0)
        {
            a=(-1)*a;
            for(int i=0;i<(-1)*b;i++)
            {
                a++;
            }
            return (-1)*a;
        }
        for(int i=0;i<max;i++)
        {
            min++;
        }
        return min;
    }
}