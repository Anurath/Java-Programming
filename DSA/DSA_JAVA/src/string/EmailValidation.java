package string;

public class EmailValidation {

	public static void main(String[] args) {
		String email = "anurthwaghmode2018@gmail.com";
		
		System.out.println(isEmailValid(email));
	}
	
	public static boolean isEmailValid(String email)
	{
		if(email.length()>10)
		{
			int  dot = 0;
			int speChar = 0;
			
			String endWith = "@gmail.com";
			
			
			for(int i=0;i<email.length()-10;i++)
			{
				if(email.charAt(i)>='A'&&email.charAt(i)<='Z')
				{
					return false;
				}
				if(email.charAt(i)<'0'|| (email.charAt(i)>'9'&& email.charAt(i)<'A')|| (email.charAt(i)>'Z'&&email.charAt(i)<'a') || (email.charAt(i)>'z'))
				{
					speChar++;
				}
			}
			for(int j=endWith.length()-1,k=email.length()-1;j>=0;j--,k--)
			{
				if(endWith.charAt(j)!=email.charAt(k))
				{
					return false;
				}
			}
			if(speChar==0)
			{
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
