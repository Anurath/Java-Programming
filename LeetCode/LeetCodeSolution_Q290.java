class LeetCodeSolution_Q290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if(pattern.length()==words.length)
        {
            int[] ref = new int[pattern.length()];

            for(int i=0;i<pattern.length();i++)
            {
                if(ref[i]!=-1)
                {
                    String temp = words[i];
                    char ch = pattern.charAt(i);
                    for(int j=i;j<pattern.length();j++)
                    {
                        if(pattern.charAt(j)==ch)
                        {
                            if(words[j].equals(temp))
                            {
								ref[j]=-1;
                            }
                            else{
                                return false;
                            }
                        }
                        else if(words[j].equals(temp))
                        {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}