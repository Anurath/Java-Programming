class LeetCodeSolution_Q2114{
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0 ;
        for(int i=0;i<sentences.length;i++)
        {
            int maxW = maxWords(sentences[i]);
            if(maxW>maxWords)
            {
                maxWords = maxW;
            }
        }
        return maxWords;
    }

    public static int maxWords(String sentance)
    {
        int cnt=1;
        for(int i=0;i<sentance.length();i++)
        {
            if(sentance.charAt(i)==' ')
            {
                cnt++;
            }
        }
        return cnt;
    }
}