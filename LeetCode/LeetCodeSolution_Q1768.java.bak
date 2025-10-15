class LeetCodeSolution_Q1768 {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        
        int i=0,j=0;

        while(i<word1.length()&& j<word2.length())
        {
            ans+=(char)word1.charAt(i++);
            ans+=(char)word2.charAt(j++);
        }
        while(i<word1.length())
        {
            ans+=(char)word1.charAt(i++);
        }
        while(j<word2.length())
        {
            ans+=(char)word2.charAt(j++);
        }
        return ans;
    }
}