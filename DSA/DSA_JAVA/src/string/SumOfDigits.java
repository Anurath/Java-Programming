package string;

public class SumOfDigits {

	public static void main(String[] args)
	{
		String str = "anurath1234asdf1234";
		System.out.println(sumOfDigit(str));
	}
	public static int sumOfDigit(String str)
	{
		int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)<='9'&& str.charAt(i)>='0')
			{
				sum+=(str.charAt(i)-48);
			}
		}
		return sum;
	}
}
