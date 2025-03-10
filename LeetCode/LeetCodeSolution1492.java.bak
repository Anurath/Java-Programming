class LeetCodeSolution1492 {
    public int kthFactor(int n, int k) {
        byte factPos = 0;
        for(short i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                factPos++;
            }
            if(factPos==k)
            {
                return i;
            }
        }
        return -1;
    }
}