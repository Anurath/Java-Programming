class LeetCodeSolution_Q1342{
    public int numberOfSteps(int num) {
        short cnt=0;
        while(num!=0)
        {
            if(num%2==0)
            {
                num/=2;
                cnt++;
            }
            else{
                num-=1;
                cnt++;
            }
        }
        return cnt;
    }
}