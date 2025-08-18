class LeetCodeSolution_Q2138{
    public String[] divideString(String s, int k, char fill) {
        int len = s.length()/k ;
        if(s.length()%k!=0)
        {
            len++;
        }
        String[] ans = new String[len];
        String temp = "";
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            temp+=(char)s.charAt(i);
            if(temp.length()==k)
            {
                ans[j++] =temp;
                temp = "";
            }
        }
		if(temp.length()!=0)
		{
			ans[j]=temp;
		}
        if(ans[ans.length-1].length()!=k)
        {
            for(int l=ans[ans.length-1].length();l<k;l++)
            {
                ans[ans.length-1]+=(char)fill;
            }
        }
        return ans;
    }
}