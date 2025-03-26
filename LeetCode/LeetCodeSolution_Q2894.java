class LeetCodeSolution_Q2894{
    public int differenceOfSums(int n, int m) {
        int divNum=0;
        int nonDivNum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%m==0)
            {
                divNum+=i;
            }
            else
            {
                nonDivNum+=i;
            }
        }
        return nonDivNum-divNum; 
    }
}