class LeetCodeSolution_Q3340{
    public boolean isBalanced(String num) {
        short evenSum=0,oddSum=0;
        for(byte i=0;i<num.length();i++)
        {
           int n=num.charAt(i)-'0';
            if(i%2==0)
            {
                evenSum+=n;
            }
            else
            {
                oddSum+=n;
            }
        }
        return evenSum==oddSum;
    }
}