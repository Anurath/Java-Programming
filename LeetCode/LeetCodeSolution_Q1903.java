class LeetCodeSolution_Q1903 {
    public String largestOddNumber(String num) {
        String ans = "";
        boolean flag = false;
        for(int i=num.length()-1;i>=0;i--)
        {
            if( !(flag) && num.charAt(i)%2!=0)
            {
                flag = true;
            }
            if(flag)
            {
                ans=num.charAt(i)+ans;
            }
        }
        return ans;
    }
}