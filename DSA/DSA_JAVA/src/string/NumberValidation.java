package string;

public class NumberValidation {

	public static void main(String[] args) {
		String num = "9876543210";
		
		System.out.println(isValid(num));
	}
	
	public static boolean isValid(String num)
	{
		if(num.length()==10)
		{
			if(num.charAt(0)=='9'|| num.charAt(0)=='8'|| num.charAt(0)=='j'|| num.charAt(0)=='6')
			{
				int i=0;
				for(;i<num.length();i++)
				{
					if(!(num.charAt(i)>='0'&&num.charAt(i)<='9'))
					{
						return false;
					}
				}
				if(i==num.length())
				{
					return true;
				}
			}
			else
			{
				return false;
			}
		}
		return false;
	}
}
