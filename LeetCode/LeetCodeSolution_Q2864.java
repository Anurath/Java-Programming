class LeetCodeSolution_Q2864 {
    public String maximumOddBinaryNumber(String s) {
        
        String ans = "";

        for(int i = 0; i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                ans = ans+"0";
            }
            else{
                ans = "1"+ans;
            }
        }

        return ans.substring(1)+"1";
    }
}