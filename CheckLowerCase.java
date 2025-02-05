import java.util.Scanner;
class CheckLowerCase
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);

		String ans = (ch>=90&&ch<=122)?("The given character is lowercase"):("The given character is not lowerCase");
		System.out.print(ans);
	}
}