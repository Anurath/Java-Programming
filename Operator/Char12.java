import java.util.Scanner;
class Char12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);

		String ans = (ch>=65&&ch<=90 || ch <= 122 && ch>=97)?((ch>=65&&ch<=90)?"UpperCase":"LowerCase"):((ch>=48 &&ch<=59)?"Digit":"Special char");
	}
}