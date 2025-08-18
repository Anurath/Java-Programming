class LeetCodeSolution_Q2000{
    public String reversePrefix(String word, char ch) {
        String ans = "";
        int i=0;
        for(;i<word.length();i++)
        {
            if(ch==word.charAt(i))
            {
                break;
            }
        }

        if(i==word.length())
        {
            return word;
        }
        for(int j=i;j>=0;j--)
        {
            if(j<word.length())
            {
                ans+=(char)word.charAt(j);
            }
        }
        for(int k=i+1;k<word.length();k++)
        {
            ans+=(char)word.charAt(k);
        }

        return ans;
    }
}