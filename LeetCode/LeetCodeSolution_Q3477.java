class LeetCodeSolution_Q3477{
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int cnt=0;
        for(int i=0;i<baskets.length;i++)
        {
            boolean flag =true;
            for(int j=0;j<baskets.length;j++)
            {  
                if(fruits[i]<=baskets[j])
                {
                    flag =false;
                    baskets[j]=0;
                    break;
                }
            }
            if(flag)
            {
                cnt++;
            }
        }
        return cnt;
    }
}