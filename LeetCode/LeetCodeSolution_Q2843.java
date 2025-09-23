class LeetCodeSolution_Q2843 {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;

        while(low<=high)
        {
            if(isSym(low))
            {
                cnt++;
            }
            low++;
        }
        return cnt;
    }

    public boolean isSym(int num)
    {
        int len = (num+"").length();

        if(len==2||len==4)
        {
            if(len==2)
            {
                if(num%10==num/10)
                {
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                int f = num%100;
                    int l = num/100;

                    f = f%10+f/10;
                    l = l/10+l%10;

                    return f==l;
            }
        }
        return false;
    }
}