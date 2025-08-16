package string;

public class LongestPalindrome {

	public static void main(String[] args) {
		System.out.println(longPal("abba"));
	}
	
	public static String longPal(String s)
	{
		String lPal = "";
		int max = 0,i=1,j=0,k=0;
		String temp = "";
		boolean inProcess = true,firstProcess=false,secondProcess=false;
		while(i<s.length())
		{
			if(s.charAt(i)==s.charAt(i-1)&& inProcess)
			{
				firstProcess=true;
				inProcess=false;
			}
			
			if(s.charAt(i-1)==s.charAt(i+1)&& inProcess)
			{
				secondProcess=true;
				inProcess=false;
			}
			
			if(firstProcess)
			{
				if(s.charAt(i+j)==s.charAt(i-j))
				{
					temp=s.charAt(i-j)+temp;
					temp=temp+s.charAt(i+j);
					j++;
				}
				else
				{
					if(max<temp.length())
					{
						lPal = temp;
						max = temp.length();
					}
					temp="";
					firstProcess=false;
					i++;
					j=0;
				}
			}
		}
		return temp;
	}
}
