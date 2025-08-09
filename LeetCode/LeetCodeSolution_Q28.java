class LeetCodeSolution_Q28{
    public int strStr(String haystack, String needle) {
        if(haystack.length()>=needle.length())
		{
			for(int i=0;i<haystack.length()-needle.length()+1;i++)
			{
				int k=i;
				boolean flag=true;
				for(int j=0;j<needle.length();j++)
				{
					if(k<haystack.length() && haystack.charAt(k++)!=needle.charAt(j))
					{
						flag=false;
						break;
					}
				}
				if(flag)
				{
					return i;
				}
			}
		}
		else
		{
			return -1;
		}
		return -1;
    }
}