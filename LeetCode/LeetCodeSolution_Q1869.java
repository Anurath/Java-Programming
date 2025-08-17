class LeetCodeSolution_Q1869 {
    public boolean checkZeroOnes(String s) {
        int maxOne = 0 , maxZero = 0,j=0,k=0;

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            {
                j++;
                if(k>maxZero)
                {
                    maxZero=k;
                }
                k=0;
            }
            else{
                k++;
                if(j>maxOne)
                {
                    maxOne=j;
                }
                j=0;
            }
        }

        if(j>maxOne)
        {
            maxOne=j;
        }
        if(k>maxZero)
        {
            maxZero=k;
        }
        return maxOne>maxZero;
    }
}