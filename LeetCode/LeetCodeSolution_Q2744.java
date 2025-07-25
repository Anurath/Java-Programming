class LeetCodeSolution_Q2744{
    public static int maximumNumberOfStringPairs(String[] words) {
        byte cnt =0;

        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(words[i].equals(reverse(words[j])))
                {
                    cnt++;
                }
            }
        }
		return cnt;
    }

    public static String reverse(String str)
    {
        String ansStr = "";

        for(int i=0;i<str.length();i++)
        {
            ansStr = str.charAt(i)+ansStr;
        }
        return ansStr;
    }
}