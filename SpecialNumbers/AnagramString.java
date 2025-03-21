class AnagramString
{
	public static void main(String[] args)
	{
		String s="anagram";
		String t="nagaram";
		for(int i=0;i<s.length();i++)
		{
			int sCount=0;
			int tCount=0;
			char ch=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					sCount++;
				}
				if(ch==t.charAt(j))
				{
					tCount++;
				}
			}
			if(tCount!=sCount)
			{
				System.out.println("not anagram0");
				return;
			}
		}
		System.out.println("anagram");
	}
}
