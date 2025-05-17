class LeetCodeSolution_Q3438{
    public String findValidPair(String s) {
        String res="";
        for(byte i=0;i<s.length()-1;i++)
        {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1!=ch2)
            {
                boolean flag = true;
                int cnt1=0;
                int cnt2=0;
                for(byte j=0;j<s.length();j++)
                {
                    if(s.charAt(j)==ch1)
                    {
                        cnt1++;
                    }
                    if(s.charAt(j)==ch2)
                    {
                        cnt2++;
                    }
                }
                if((ch1-'0')==cnt1 && (ch2-'0'==cnt2))
                {
                    return res=cnt1+""+cnt2;
                }
            }
        }
        return res;
    }
}