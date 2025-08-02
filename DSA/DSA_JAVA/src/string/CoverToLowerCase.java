package string;

public class CoverToLowerCase {

	public static void main(String[] args)
	{
		String s = "IUAWHAODIFH";
		System.out.println(lowerCase(s));
	}
	
	public static String lowerCase(String s)
	{
		String ans = "";
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				ans+=(char)(ch+32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
}
