import java.util.Scanner;
class PalindromeString1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str = sc.next();
		String tmp="";
		
		for (int i=0;i<str.length() ; i++)
		{
			char ch = str.charAt(i);
			tmp=ch+tmp;
		}
		if(tmp.equals(str))
		{
			System.out.print("This string is palindrome.");
		}
		else
		{
			System.out.print("This is not a palindrome.");
		}
	}
}