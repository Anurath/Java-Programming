package wrapperClass;

public class PremitiveToString {

	public static void main(String[] args)
	{
		int num1 = 100;
		String s1 = String.valueOf(num1);
		System.out.println(s1+"10");
		
		boolean flag = true;
		String s2 = String.valueOf(flag);
		System.out.println(s2+10);
		
		char ch = '1';
		String s3 = String.valueOf(ch);
		System.out.println(s3);
	}
}
