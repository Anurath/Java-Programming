package string;

public class StringClone {
	
	public static void main(String[] args) {
//		String s1 = "Aditya";
//		String s2 = "aditya";
//		System.out.println(compareTo(s1, s2));
//		System.out.println(endWith("asdfsdf","df"));
//		
//		String s1 = "ssass";
//		String s2 = "as";
//		
//		System.out.println(contains(s1,s2));
		
//		System.out.println(intend("Anurath", 10));
		
		System.out.println(indexOf("Anurath", 't'));
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
	
	public String concat(String s1, String s2)
	{
		return s1+s2;
	}
	
	public static boolean endWith(String s,String com)
	{
		if(s.length()<com.length())
		{
			for(int i=com.length()-1,j=s.length()-1;i>=0;i--)
			{
				if(com.charAt(i)!=s.charAt(j))
				{
					return false;
				}
				j--;
			}
			return true;
		}
		return false;
	}
	
	
	public static boolean contains(String s1,String s2)
	{
		int check =0;
		if(s1.length()>s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if( s1.charAt(i)==s2.charAt(check) && check<s2.length())
				{
					check++;
				}
				else
				{
					if(check==s2.length())
					{
						return true;
					}
					else if(s2.charAt(0)==s1.charAt(i))
					{
						i--;
					}
					check=0;
				}
			}
		}
		return check==s2.length();
	}
	
	
	
	public static String intend(String s,int spaces)
	{
		for(int i=0;i<spaces;i++)
		{
			s=" "+s;
		}
		return s;
	}
	
	public static int indexOf(String s,char ch)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	
	public static boolean isBlack(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEmpty(String s)
	{
		if(s.length()>0)
		{
			return false;
		}
		return true;
	}
	
	
	
	public static int lasIndexOf(String s,char ch)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==ch)
			{
				return i;
			}
		}
		return -1;
	}
	
	public static String repeat(String s,int cnt)
	{
		for(int i=0;i<cnt;i++)
		{
			s+=s;
		}
		return s;
	}
	
	public static String replace(String s,char old,char naya)
	{
		String ans = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==old)
			{
				ans+=naya;
			}
			else {
				ans+=s.charAt(i);
			}
		}
		return ans;
	}
	
	
	
	
}