package string;

public class LongestSubSequence {
	
	public static void main(String[] args)
	{
		System.out.println(longestSubSequence("ADDITYA","ADIADITA"));
	}

	public static String longestSubSequence(String s1,String s2)
	{
		String ans = "";
		int max=0;
		
		for(int i=0;i<s1.length();i++)
		{
			String temp="";
			int k=i;
			int tempMax=0;
			int cnt=0;
			for(int j=0;j<s2.length()&&k<s1.length();)
			{
				if(s1.charAt(k++)==s2.charAt(j))
				{
					temp+=s2.charAt(j);
					tempMax++;
					cnt++;
					j++;
				}
				else {
					if(max<tempMax)
					{
						max=tempMax;
						ans=temp;
					}
					k=i;
					tempMax=0;
					temp="";
					if(cnt==0)
					{
						j=j+1;
					}
					else {
						j=j-cnt+1;
						cnt=0;
					}
				}
			}
		}
		return ans;
	}
}
