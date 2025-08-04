package string;

public class StringClone {
	
	public static void main(String[] args) {
		String s1 = "Aditya";
		String s2 = "aditya";
		System.out.println(compareTo(s1, s2));
	}

	public int length(String s)
	{
		int i=0;
		while(true)
		{
			try
			{
				char ch = s.charAt(i);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				break;
			}
			i++;
		}
		return i;
	}
	
	public int codePoint(char ch)
	{
		return ch;
	}
	
	public static int compareTo(String s1 , String s2)
	{
		int cnt1 =0;
		int cnt2 = 0;
		
		for(int i=0;i<s1.length();i++)
		{
			cnt1+=s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			cnt2+=s2.charAt(i);
		}
		
		return cnt1-cnt2;
	}
}
