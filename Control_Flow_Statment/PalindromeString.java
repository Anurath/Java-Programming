import java.util.Scanner;
class PalindromeString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		String temp1="";
		String temp2="";

		for (int i=0;i<str.length() ;i++ )
		{
			char ch= str.charAt(i);
			temp1=ch+temp1;
			temp2=temp2+ch;
			if (temp1.length()>1)
			{
				if (temp1.equals(temp2))
				{
					System.out.println("Yes it is palindrome : "+temp1);
					break;
				}
			}
		}
	}
}
