package string;

public class ToggleCase {

	public static void main(String[] args)
	{
		String s = "asfkjALKSJJFF";
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
			else if(ch>='A'&&ch<='Z')
			{
				ans+=(char)(ch+32);
			}
			else {
				ans+=ch;
			}
		}
		return ans;
	}
}
