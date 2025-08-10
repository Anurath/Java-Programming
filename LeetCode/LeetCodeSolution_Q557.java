class LeetCodeSolution_Q557{
    public String reverseWords(String s) {
        String ans="";
		String temp = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				if(temp.length()>0)
				{
					if(ans.length()>0)
					{
						ans+=' ';
					}
					ans+=reverse(temp);
					temp="";
				}
			}
			else
			{
				temp+=s.charAt(i);
			}
		}
		if(temp.length()>0)
		{
			if(ans.length()>0)
			{
				ans+=' ';
			}
			ans+=reverse(temp);
		}
		return ans;
    }
    public static String reverse(String s)
	{
		String rev = "";

		for(int i=0;i<s.length();i++)
		{
			rev= s.charAt(i)+rev;
		}
		return rev;
	}
}