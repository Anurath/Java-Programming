package string;

import java.util.Arrays;

public class SplitByChar {

	public static void main(String[] args) {
		String str = "I love India.";
		System.out.println(Arrays.toString(split(str, 'I')));
	}
	
	public static String[] split(String str, char ch)
	{
		int cnt=0;
		for(int i=1;i<str.length()-1;i++)
		{
			if(str.charAt(i)==ch)
			{
				cnt++;
			}
		}
		if(cnt>0)
		{
			int idx =0;
			String[] ans = new String[cnt+1];
			
			 for(int i=0;i<str.length();i++)
			 {
				 String temp="";
				 while(i<str.length() && str.charAt(i)!=ch)
				 {
					 temp+=str.charAt(i);
					 i++;
				 }
				 if(temp.length()>0)
				 {
					 if(idx<=cnt)
					 {
						 ans[idx++]=temp;
					 }
					 temp="";
				 }
			 }
			 return ans;
		}
		return null;
	}
	
}
