package string;

public class ReplaceCharInString {

	public static void main(String[] args) {
		String s = "banana";
		
		System.out.println(replace(s, 'a', '@'));
	}
	
	public static String replace(String s, char old, char naya)
	{
		String ans = "";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==old)
			{
				ans+=naya;
			}
			else
			{
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
}
