class LeetCodeSolution_Q2129{
    public static String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        String ans = "";
        for(int i=0;i<str.length;i++)
        {
            if(str[i].length()<=2)
            {
                ans+=str[i].toLowerCase()+" ";
            }
            else{
                ans+=toCapitalize(str[i])+" ";
            }
        }
        return ans.trim();
    }
    public static String toCapitalize(String s)
    {
        String str = "";
        if(s.charAt(0)>='a')
        {
            str+=(char)(s.charAt(0)-32);
        }
        else
        {
            str+=(char)(s.charAt(0));
        }

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)<='Z')
			{
				str+=(char)(s.charAt(i)+32);
			}
			else
			{
				str+=(char)s.charAt(i);
			}
        }
        return str;
    }
}