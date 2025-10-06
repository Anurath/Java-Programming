class LeetCodeSolution_Q3110{
    public int scoreOfString(String s) {
        int sum = 0;

        for(int i=0;i<s.length()-1;i++)
        {
            int absDiff = s.charAt(i)-s.charAt(i+1);
            if(absDiff<0)
            {
                absDiff*=-1;
            }
            sum+=(absDiff);
        }
        return sum;
    }
}