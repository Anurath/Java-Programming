package string;

public class Trim {

	
	public static void main(String[] args) {
		String name = "anurath";
		System.out.println(trim(name));
	}
	
	public static String trim(String str)
	{
		String ans = "";
		
		boolean start = false,end = false;
		
		for(int i=0,j=str.length();i<j;i++)
		{
			if(str.charAt(i)!=' '&& !start)
			{
				start = true;
			}
			if(start)
			{
				ans+=str.charAt(i);
			}
			
			if(str.charAt(j-1)==' ' && !end)
			{
				j--;
			}
			else {
				end=true;
			}
		}
		return ans;
	}
}
