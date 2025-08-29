class LeetCodeSolution_Q1941 {
    public boolean areOccurrencesEqual(String s) {
        int ref = 0;
		boolean flag = true;
        int[] ans = new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            if(ans[i]!=-1)
            {
                int cnt=1;
                for(int j=i+1;j<s.length();j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        cnt++;
                        ans[j]=-1;
                    }
                }
                ans[i]=cnt;
				if(flag)
				{
					ref = cnt;
					flag =  false;
				}

				if(cnt!=ref)
				{
					return false;
				}
            }
        }
		return true;
    }
}