import java.util.Scanner;
class CheckUpperCaseChar
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);

		String ans = (ch>=65&&ch<=90)?("UpperCase Character"):("Not an UpperCase Character.");
		System.out.print(ans);
	}
}