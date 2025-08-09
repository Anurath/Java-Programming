package string;

public class PasswordValidation {

	public static void main(String[] args) {
		String pass ="Anurath@999";
		
		System.out.println(isValidPassword(pass));
	}
	
	public static boolean isValidPassword(String pass)
	{
		if(pass.length()>8)
		{
			boolean upperCase = false;
			boolean lowerCase = false;
			int num=0;
			int specialChar =0;
			
			for(int i=0;i<pass.length();i++)
			{
				char ch = pass.charAt(i);
				
				if(ch>='a'&&ch<='z')
				{
					lowerCase = true;
				}
				else if(ch>='A'&&ch<='Z')
				{
					upperCase = true;
				}
				else if(ch>='0'&&ch<='9')
				{
					num++;
				}
				else if(ch!=' ')
				{
					specialChar++;
				}
			}
			if(upperCase&&lowerCase&&num==3&&specialChar==1)
			{
				return true;
			}
		}
		return false;
		
	}
}