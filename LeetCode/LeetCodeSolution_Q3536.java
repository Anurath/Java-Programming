class LeetCodeSolution_Q3536 {
    public int maxProduct(int n) {
        int max = 0;
        int secMax = 0;
        while(n!=0)
        {
            if(n%10>max)
            {
                secMax = max;
                max = n%10;
            }
            else if(n%10>secMax)
            {
                secMax = n%10;
            }
            n/=10;
        }
        return max*secMax;
    }
}