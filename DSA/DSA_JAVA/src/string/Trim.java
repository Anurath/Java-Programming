package string;

public class Trim {

	
	public static void main(String[] args) {
		
	}
	
	public static String trim(String str)
	{
		String ans = "";
		boolean start = false;
		boolean end = true;
		
		int j=0;
		for(int i=0;i<str.length()-j;i++)
		{
			if(str.charAt(i)!=' '&& !start)
			{
				start=true;
			}
			else if(start)
			{
				ans+=str.charAt(i);
			}
			
			if(end && str.charAt(str.length()-1-j)==' ')
			{
				
			}
		}
	}
}
