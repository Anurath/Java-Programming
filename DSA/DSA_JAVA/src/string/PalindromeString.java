package string;

public class PalindromeString {

	public static void main(String[] args)
	{
		String s = "acdbca";
		int i=0;
		for(;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				System.out.println("Not a palindrome");
				break;
			}
		}
		if(i>=s.length()/2)
		{
			System.out.println("String is palindrome");
		}
	}
}
