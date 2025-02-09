import java.util.Scanner;
class ReverseString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		String temp = "";

		for (int i=0;i<str.length() ;i++ )
		{
			char ch = str.charAt(i);
			temp=ch+temp;
		}
		System.out.print(temp);
	}
}