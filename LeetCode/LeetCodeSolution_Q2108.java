class LeetCodeSolution_Q2108{
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++)
        {
            if(isPal(words[i]))
            {
                return words[i];
            }
        }
        return "";
    }
    public static boolean isPal(String s)
    {
        for(int i=0,j=s.length()-1;i<j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                return false;
            }
        }
        return true;
    }
}