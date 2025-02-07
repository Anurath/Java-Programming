import java.util.Scanner;
class CheckDigit
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		char ch = sc.next().charAt(0);
		String ans = (ch>=48&&ch<='9')?("This character is a digit."):("The given character is not dogit.");
		System.out.print(ans);
	}
}