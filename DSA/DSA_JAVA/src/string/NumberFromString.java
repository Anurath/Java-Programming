package string;

public class NumberFromString {

	public static void main(String[] args) {
		String str = "sf234n345ssdf4";
		
		System.out.println(number(str));
	}
	
	public static int number(String str)
	{
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0'&& str.charAt(i)<='9')
			{
				num=num*10+(str.charAt(i)-48);
			}
		}
		return num;
	}
}
