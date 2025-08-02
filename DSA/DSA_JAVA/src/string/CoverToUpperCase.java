package string;

public class CoverToUpperCase {

	public static void main(String[] args)
	{
		String s = "asfkj";
		System.out.println(upperCase(s));
	}
	
	public static String upperCase(String s)
	{
		String ans = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				ans+=(char)(ch-32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
}
