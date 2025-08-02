package string;

public class MaxCharInString {

	public static void main(String[] args)
	{
		String s = "asdfoiasioddfnvoijuhydddkfnasdgg";
		
		char maxChar = Character.MIN_VALUE;
		
		for(int i=0,j=s.length()-1;i<j;i++,j--)
		{
			char ch = s.charAt(i);
			if(maxChar<ch)
			{
				maxChar = ch;
			}
			
			char ch1 = s.charAt(j);
			if(maxChar<ch1)
			{
				maxChar=ch1;
			}
		}
		
		System.out.println(maxChar);
	}
}
